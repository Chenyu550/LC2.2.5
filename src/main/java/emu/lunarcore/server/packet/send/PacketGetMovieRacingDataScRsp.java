package emu.lunarcore.server.packet.send;

import emu.lunarcore.proto.GetMovieRacingDataScRspOuterClass;
import emu.lunarcore.proto.MovieRacingTypeOuterClass;
import emu.lunarcore.proto.RacingDataOuterClass.RacingData;
import emu.lunarcore.server.packet.BasePacket;
import emu.lunarcore.server.packet.CmdId;

public class PacketGetMovieRacingDataScRsp extends BasePacket {

    public PacketGetMovieRacingDataScRsp() {
        super(CmdId.GetMovieRacingDataScRsp);

        var data = GetMovieRacingDataScRspOuterClass.GetMovieRacingDataScRsp.newInstance()
            .addRacingData(RacingData.newInstance()
                .setType(MovieRacingTypeOuterClass.MovieRacingType.MOVIE_RACING_SHOOTING)
                .setMaxScore(1000)
                .setLevel(1)
                .setJCBFOKGBHBO(1)
            )
            .addRacingData(RacingData.newInstance()
                .setType(MovieRacingTypeOuterClass.MovieRacingType.MOVIE_RACING_OVER_TAKE)
                .setMaxScore(2000)
                .setLevel(2)
                .setJCBFOKGBHBO(1)
            )
            .addRacingData(RacingData.newInstance()
                .setType(MovieRacingTypeOuterClass.MovieRacingType.MOVIE_RACING_OVER_TAKE)
                .setMaxScore(2000)
                .setLevel(3)
                .setJCBFOKGBHBO(1)
            )
            .addRacingData(RacingData.newInstance()
                .setType(MovieRacingTypeOuterClass.MovieRacingType.MOVIE_RACING_OVER_TAKE)
                .setMaxScore(2500)
                .setLevel(4)
                .setJCBFOKGBHBO(1)
            )
            .addRacingData(RacingData.newInstance()
                .setType(MovieRacingTypeOuterClass.MovieRacingType.MOVIE_RACING_OVER_TAKE)
                .setMaxScore(3500)
                .setLevel(5)
                .setJCBFOKGBHBO(1)
            )
            .addRacingData(RacingData.newInstance()
                .setType(MovieRacingTypeOuterClass.MovieRacingType.MOVIE_RACING_OVER_TAKE)
                .setMaxScore(2500)
                .setLevel(6)
                .setJCBFOKGBHBO(1)
            )
            .addRacingData(RacingData.newInstance()
                .setType(MovieRacingTypeOuterClass.MovieRacingType.MOVIE_RACING_OVER_TAKE)
                .setMaxScore(3000)
                .setLevel(7)
                .setJCBFOKGBHBO(1)
            )
            .addRacingData(RacingData.newInstance()
                .setType(MovieRacingTypeOuterClass.MovieRacingType.MOVIE_RACING_OVER_TAKE)
                .setMaxScore(3000)
                .setLevel(8)
                .setJCBFOKGBHBO(1)
            )
            .addRacingData(RacingData.newInstance()
                .setType(MovieRacingTypeOuterClass.MovieRacingType.MOVIE_RACING_OVER_TAKE)
                .setMaxScore(3500)
                .setLevel(9)
                .setJCBFOKGBHBO(1)
            )
            .addRacingData(RacingData.newInstance()
                .setType(MovieRacingTypeOuterClass.MovieRacingType.MOVIE_RACING_OVER_TAKE)
                .setMaxScore(4850)
                .setLevel(10)
                .setJCBFOKGBHBO(1)
            );

        this.setData(data);
    }
}
