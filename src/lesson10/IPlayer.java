package lesson10;

public interface IPlayer {

    /**
     * Интерфейс - это "набросок" будущего класса
     * 1 - объект данного интерфейса создать нельзя
     * 2 - все методы не имеют тела (тоесть
     * являются якобы наброском того что должно быть внутри класса)
     * 3 -
     */

    void addCardToHand(Card card);

    boolean needsCard();

    void openHand();

    void setName(String name);
}
