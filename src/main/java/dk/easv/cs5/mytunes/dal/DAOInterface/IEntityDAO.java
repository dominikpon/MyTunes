package dk.easv.cs5.mytunes.dal.DAOInterface;

public interface IEntityDAO<T> {
    public void save(T entity);
    public void edit(T entity);
    public void remove(int id);
}
