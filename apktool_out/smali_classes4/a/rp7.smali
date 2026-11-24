.class public final synthetic La/rp7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:Z

.field public final synthetic g:J

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/gr00;JJLjava/lang/String;JJZ)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/rp7;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/rp7;->h:Ljava/lang/Object;

    iput-wide p2, p0, La/rp7;->b:J

    iput-wide p4, p0, La/rp7;->d:J

    iput-object p6, p0, La/rp7;->c:Ljava/lang/String;

    iput-wide p7, p0, La/rp7;->e:J

    iput-wide p9, p0, La/rp7;->g:J

    iput-boolean p11, p0, La/rp7;->f:Z

    return-void
.end method

.method public synthetic constructor <init>(La/uzg;JLjava/lang/String;JJZJ)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/rp7;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/rp7;->h:Ljava/lang/Object;

    iput-wide p2, p0, La/rp7;->b:J

    iput-object p4, p0, La/rp7;->c:Ljava/lang/String;

    iput-wide p5, p0, La/rp7;->d:J

    iput-wide p7, p0, La/rp7;->e:J

    iput-boolean p9, p0, La/rp7;->f:Z

    iput-wide p10, p0, La/rp7;->g:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/rp7;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/rp7;->h:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v1, La/uzg;

    .line 9
    .line 10
    check-cast p1, La/k0w0;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v0, v1, La/uzg;->b:La/vqc;

    .line 16
    .line 17
    new-instance v1, Lorg/xplatform/cyber/section/api/tournament_bracket/CyberTournamentBracketParams;

    .line 18
    .line 19
    iget-wide v2, p0, La/rp7;->b:J

    .line 20
    .line 21
    iget-wide v4, p0, La/rp7;->d:J

    .line 22
    .line 23
    iget-wide v6, p0, La/rp7;->e:J

    .line 24
    .line 25
    iget-wide v8, p0, La/rp7;->g:J

    .line 26
    .line 27
    iget-object v10, p0, La/rp7;->c:Ljava/lang/String;

    .line 28
    .line 29
    iget-boolean v11, p0, La/rp7;->f:Z

    .line 30
    .line 31
    invoke-direct/range {v1 .. v11}, Lorg/xplatform/cyber/section/api/tournament_bracket/CyberTournamentBracketParams;-><init>(JJJJLjava/lang/String;Z)V

    .line 32
    .line 33
    .line 34
    new-instance p0, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$tournamentBracketScreen$1;

    .line 35
    .line 36
    invoke-direct {p0, v0, v1}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$tournamentBracketScreen$1;-><init>(La/vqc;Lorg/xplatform/cyber/section/api/tournament_bracket/CyberTournamentBracketParams;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 40
    .line 41
    .line 42
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_0
    check-cast v1, La/gr00;

    .line 46
    .line 47
    check-cast p1, La/k0w0;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v0, v1, La/gr00;->e:Ljava/lang/Object;

    .line 53
    .line 54
    new-instance v1, Lorg/xplatform/feed/navigation/OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1;

    .line 55
    .line 56
    iget-wide v2, p0, La/rp7;->b:J

    .line 57
    .line 58
    iget-wide v4, p0, La/rp7;->d:J

    .line 59
    .line 60
    iget-wide v6, p0, La/rp7;->e:J

    .line 61
    .line 62
    iget-wide v8, p0, La/rp7;->g:J

    .line 63
    .line 64
    iget-object v10, p0, La/rp7;->c:Ljava/lang/String;

    .line 65
    .line 66
    iget-boolean v11, p0, La/rp7;->f:Z

    .line 67
    .line 68
    invoke-direct/range {v1 .. v11}, Lorg/xplatform/feed/navigation/OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1;-><init>(JJJJLjava/lang/String;Z)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 72
    .line 73
    .line 74
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
