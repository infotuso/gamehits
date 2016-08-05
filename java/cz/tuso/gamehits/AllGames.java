package cz.tuso.gamehits;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Comparator;
import android.support.v4.view.ViewPager;
import android.content.Intent;

public class AllGames extends AppCompatActivity {

    ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.games_list);

        ArrayList<Game> games = new ArrayList<Game>();
        games.add(new Game("Broken Sword",1996,R.drawable.bsword,"Uncover the identity of a jester assassin. Unlock the legend of the Knights Templar. Unravel a plot as twisted as the catacombs you're about to prowl. As George Stobbart, an American in Paris, you find it odd when an accordion-playing clown darts out of a cafe clutching a briefcase. Moments later, you're sent flying, violently thrown through the air by the force of a massive explosion, right into a sinister, global intrigue. The coveted contents of that briefcase? A fiercely guarded manuscript penned by a clandestine medieval order - the Knights Templar. Reveal the truth behind a secret conspiracy and save the world from the Templars' evil plan."));
        games.add(new Game("Commandos",1998,R.drawable.commandos,"Study the enemy's movements, carefully develop a plan, synchronize your men, then launch them on a swift and fierce attack using all your power and skill. You have been selected for active service in the Commandos Corps, and must now mobilise in dangerous missions. You will be given the opportunity to push your daring and tactical ability to the limit. As the leader of a small elite unit operating deep within enemy territory, you will experience real challenges and missions. Clever strategy has never been so furiously action-packed."));
        games.add(new Game("Fallout",1997,R.drawable.fallout,"Set in the aftermath of a world-wide nuclear war, Fallout will challenge you to survive in an unknown and dangerous world. You will take the role of a Vault-dweller, a person who has grown up in a secluded, underground survival Vault. Circumstances arise that force you to go Outside - to a strange world 80 years after the end of modern civilization. A world of mutants, radiation, gangs and violence. Your immediate task is to find a replacement for the broken water purification controller chip. Without that chip, your fellow Vault dwellers are doomed to dehydration or will be forced to leave the safety of the Vault for the Outside."));
        games.add(new Game("System Shock",1994,R.drawable.sshock,"You're a renowned hacker, the most notorious cyberspace thief in the corporate world. Caught during a risky break-in, you become indentured to Diego, a greedy Trioptium exec who bankrolls a rare cyberjack implant operation. After six months in a healing coma, you awaken to the twisted aftermath of a terrible disaster. Where are the surgeons? Why is the station in such disrepair? Slowly, the chilling realization that something is very wrong creeps over you. Once a prime corporate research facility, Citadel now teems with mindless cyborgs, robots and terribly mutated beings, all programmed to serve SHODAN, a ruthless A.I. There's scarcely time to think before it unleashes the first terror... "));
        games.add(new Game("Planescape: Torment",1999,R.drawable.torment,"Sigil... A place with gates that lead anywhere in existence, provided you have the proper key. It is a neutral ground and a watering hole for races across the multiverse, all under the watchful shadow of the Lady of Pain, the enigmatic ruler of the city. It is a place where the word is mightier than the sword, where thought defines reality, where belief has the power to reshape worlds and change the laws of physics..."));
        games.add(new Game("Alpha Centauri",1999,R.drawable.alpha_centauri,"Mankind begins its most monumental task – the colonization of space. A crew of internationally renowned scientists and security strategists, with wide-ranging convictions and diverse ethics, embarks on a mission that will change the world. One Planet. Seven unique factions. Which will you lead? Each faction has its own agenda, each leader a final goal. You must play to each strength and exploit each hidden weakness in your quest to rule the future."));
        games.add(new Game("Arcanum",2001,R.drawable.arcanum,"Welcome to an industrial revolution in a world of magic! Imagine a place of wonder, where magic and technology coexist in an uneasy balance, and an adventurer might just as easily wield a revolver as a flaming sword. A place where great industrial cities house castle keeps and factories, home to Dwarves, Humans, Orcs, and Elves alike. A place of arcane runes and steam-works, of magic and machines, of sorcery and science. Welcome to the land of Arcanum!"));
        games.add(new Game("Baldur's Gate",1998,R.drawable.baldurs_gate,"Since its initial release in 1998, Baldur's Gate has entertained millions of fans around the globe and has received countless awards. This classic saga of mystery, intrigue, and adventure has set the standard for Dungeons & Dragons™ computer roleplaying games_list ever since."));
        games.add(new Game("The Longest Journey",2000,R.drawable.longest_journey,"One we know as our world, a world of science and logic and stark reality. The other world lies behind the veil of sleep; an Arcadian realm of magic and chaos, a realm where dreams may come true. Imagine being able to travel between these two worlds, between Stark and Arcadia. Imagine being able to Shift between realities as easily as stepping through a doorway. In The Longest Journey, you can. And in order to save the precious Balance between worlds, between order and chaos, between science and magic, you must."));
        games.add(new Game("Theme Hospital",1997,R.drawable.theme_hospital," It's a matter of laugh or death in Theme Hospital™, another installment of the Theme series. Design, maintain and manage a hi-tech hospital facility, making the most of limited resources and turning cures into cash. The Grim Reaper stalks the corridors, the ill have some very odd ailments, and the staff want to play doctors and nurses together. No matter how you look at it, you're in control of a very sick hospital."));
        games.add(new Game("The Thief",1998,R.drawable.thief,"Having received training from an enigmatic organization known as the Keepers, Garrett leaves the order and goes back to the life of a thief on the streets of the City. Once you enter the underworld you have to deal with all the consequences - you are not the only one out there looking for decent loot. Hide in the shadows of the dark, savage city. Sneak into old ruins, haunted cathedrals and mansions of the rich. Incapacitate your enemies quietly or in an open fight. This unique sneak-em-up game provides you with a range of means to achieve your goal. Remember though - secrecy is your best friend."));
        games.add(new Game("Witcher",2007,R.drawable.witcher,"Your name is Geralt of Rivia and you are a witcher, that means you kill monsters for a living. You were given special training to be the best at what you do and your body has been enhanced with potent elixirs to help you do it. Suffering from amnesia you remember nothing of your past. Kaer Morhen, the last remaining keep of the witchers, was attacked by a mysterious organization, just as you were starting to lick your wounds there. The battle is won but the secret recipe for the mutagen, a substance required to create more of your kind, has been stolen. The surviving witchers set out to find and reclaim it and punish everyone involved. Memory loss or not, you are one of them."));
        games.add(new Game("Worms",1996,R.drawable.worms,"An absolutely engrossing game that was responsible for many sleepless nights back in the 90s is back to bring more sleepless nights now! What's there not to like about teams of 10 worms unleashing hell against each other on a fully destructible map using a wide arsenal of fun and imaginative weapons? The answer is \"nothing\". Especially if you are using the multiplayer option. The look on your buddy's face when your well-placed holy grenade sends a bunch of his best worm-soldiers to a better place is just priceless."));

        /*
        String[] names = {"Broken Sword","Commandos","Fallout","System Shock","Planescape: Torment"};
        int[] images = {R.drawable.bsword,R.drawable.commandos,R.drawable.fallout,R.drawable.sshock,R.drawable.torment};
        Random r = new Random();

        for(int i=0;i<100;i++) {
            String name = names[r.nextInt(5)];
            int image = images[r.nextInt(5)];
            int year = r.nextInt(15) + 1995 ;
            games_list.add(new Game(name,year,image));
        }
*/

        GameAdapter adapter = new GameAdapter(this,R.layout.games_list_item,games);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                long viewId = view.getId();
                Game game = (Game)parent.getItemAtPosition(position);

                if (viewId == R.id.vote) {
//                Log.i("Votes","Clicked: " + game.getName());
                    game.vote();

                    GameAdapter adapter = (GameAdapter)parent.getAdapter();

                    adapter.sort(new Comparator<Game>() {
                        @Override
                        public int compare(Game lhs, Game rhs) {
                            if ( lhs.getVotes() > rhs.getVotes() )
                                return -1;
                            else if ( lhs.getVotes() < rhs.getVotes() )
                                return 1;
                            else
                                return 0;
                        }
                    });

                    adapter.notifyDataSetChanged();

                } else {

//                    Log.i("GameHits","open details");
//                    Log.i("GameHits",view.getClass().getName());

                    Intent i = new Intent(getApplicationContext(), GameDetails.class);
                    i.putExtra("Name", game.getName());
                    i.putExtra("Year", String.valueOf(game.getYear()));
                    i.putExtra("Desc", game.getDesc());
                    i.putExtra("Image", String.valueOf(game.getImage()));
                    i.putExtra("Votes", String.valueOf(game.getVotes()));
                    startActivity(i);

                    overridePendingTransition(R.anim.from_right, R.anim.fade_out);
                }


            }
        });
    }
}
