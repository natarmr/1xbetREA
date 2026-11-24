.class public final La/wjh;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public final o:La/oeg0;

.field public final p:Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;

.field public final q:La/gr00;

.field public final r:La/qv2;

.field public final s:La/h3c;


# direct methods
.method public constructor <init>(La/mne;La/oeg0;Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;La/gr00;La/qv2;La/h3c;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v2, La/gch;

    .line 8
    .line 9
    const/16 v0, 0x11

    .line 10
    .line 11
    invoke-direct {v2, v0}, La/gch;-><init>(B)V

    .line 12
    .line 13
    .line 14
    new-instance v3, La/m7h;

    .line 15
    .line 16
    const/16 v0, 0xd

    .line 17
    .line 18
    invoke-direct {v3, v0}, La/m7h;-><init>(B)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p1, La/mne;->c:La/vs10;

    .line 22
    .line 23
    iget-object p1, p1, La/mne;->a:La/rwj;

    .line 24
    .line 25
    invoke-static {v0, p1}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v1, 0x0

    .line 31
    move-object v0, p0

    .line 32
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 33
    .line 34
    .line 35
    iput-object p2, v0, La/wjh;->o:La/oeg0;

    .line 36
    .line 37
    iput-object p3, v0, La/wjh;->p:Lorg/xplatform/cyber/section/impl/tournament_bracket/presentation/match_diaolog/model/CyberTournamentBracketMatchParams;

    .line 38
    .line 39
    iput-object p4, v0, La/wjh;->q:La/gr00;

    .line 40
    .line 41
    iput-object p5, v0, La/wjh;->r:La/qv2;

    .line 42
    .line 43
    iput-object p6, v0, La/wjh;->s:La/h3c;

    .line 44
    .line 45
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, La/tjh;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, La/pn;

    .line 10
    .line 11
    const/16 v0, 0x14

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {p1, p0, v1, v0}, La/pn;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    invoke-static {p0, v1, v1, p1, v0}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 19
    .line 20
    .line 21
    return-void
.end method
