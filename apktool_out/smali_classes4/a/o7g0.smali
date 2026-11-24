.class public final La/o7g0;
.super La/i3t0;
.source "SourceFile"


# instance fields
.field public final o:La/kki;

.field public final p:La/ctf0;

.field public final q:J


# direct methods
.method public constructor <init>(La/kki;Ljava/lang/String;La/x4u;La/mne;La/ctf0;La/vjp;JLjava/lang/String;La/r9u;)V
    .locals 10

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p9 .. p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p10 .. p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ck60;

    .line 14
    .line 15
    const/16 v0, 0x10

    .line 16
    .line 17
    move-object/from16 v1, p9

    .line 18
    .line 19
    invoke-direct {v2, p3, p2, v1, v0}, La/ck60;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/as0;

    .line 23
    .line 24
    const/16 v9, 0xb

    .line 25
    .line 26
    move-object v4, p5

    .line 27
    move-object/from16 v5, p6

    .line 28
    .line 29
    move-wide/from16 v6, p7

    .line 30
    .line 31
    move-object/from16 v8, p10

    .line 32
    .line 33
    invoke-direct/range {v3 .. v9}, La/as0;-><init>(Ljava/lang/Object;Ljava/lang/Object;JLjava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    iget-object p3, p4, La/mne;->c:La/vs10;

    .line 37
    .line 38
    iget-object p4, p4, La/mne;->a:La/rwj;

    .line 39
    .line 40
    invoke-static {p3, p4}, La/cvm0;->p(La/lne;La/lne;)La/g090;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    const/4 v5, 0x0

    .line 45
    const/4 v1, 0x0

    .line 46
    move-object v0, p0

    .line 47
    invoke-direct/range {v0 .. v5}, La/i3t0;-><init>(La/vzg0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/g090;La/yzn0;)V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, La/o7g0;->o:La/kki;

    .line 51
    .line 52
    iput-object p5, p0, La/o7g0;->p:La/ctf0;

    .line 53
    .line 54
    iput-wide v6, p0, La/o7g0;->q:J

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final x(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, La/n0g0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, La/n0g0;->a:La/dyl0;

    .line 7
    .line 8
    new-instance v0, La/gv60;

    .line 9
    .line 10
    const/16 v1, 0x9

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, p0, p1, v2, v1}, La/gv60;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x3

    .line 17
    invoke-static {p0, v2, v2, v0, p1}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 18
    .line 19
    .line 20
    return-void
.end method
