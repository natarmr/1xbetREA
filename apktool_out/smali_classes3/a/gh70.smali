.class public final La/gh70;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/xcc;

.field public final c:La/p7m0;


# direct methods
.method public constructor <init>(La/fq;La/xcc;La/mne;La/lzt;La/qa60;La/i1w0;)V
    .locals 8

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, La/w46;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, La/gh70;->b:La/xcc;

    .line 20
    .line 21
    sget-object p1, La/rv00;->x:La/rv00;

    .line 22
    .line 23
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, La/gh70;->c:La/p7m0;

    .line 28
    .line 29
    invoke-virtual {p5}, La/qa60;->a()La/vae0;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    new-instance v0, La/vf20;

    .line 34
    .line 35
    const/4 v6, 0x4

    .line 36
    const/16 v7, 0x1c

    .line 37
    .line 38
    const/4 v1, 0x2

    .line 39
    const-class v3, La/gh70;

    .line 40
    .line 41
    const-string v4, "observeCommand"

    .line 42
    .line 43
    const-string v5, "observeCommand(Lorg/xplatform/core/domain/GameCommand;)V"

    .line 44
    .line 45
    move-object v2, p0

    .line 46
    invoke-direct/range {v0 .. v7}, La/vf20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 47
    .line 48
    .line 49
    new-instance p0, La/fnq;

    .line 50
    .line 51
    const/4 p2, 0x4

    .line 52
    invoke-direct {p0, p1, v0, p2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 53
    .line 54
    .line 55
    new-instance p1, La/ib60;

    .line 56
    .line 57
    const/4 p2, 0x0

    .line 58
    const/4 p3, 0x2

    .line 59
    invoke-direct {p1, v2, p2, p3}, La/ib60;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 60
    .line 61
    .line 62
    new-instance p2, La/dnq;

    .line 63
    .line 64
    const/4 p3, 0x1

    .line 65
    invoke-direct {p2, p0, p1, p3}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 66
    .line 67
    .line 68
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-static {p2, p0}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 73
    .line 74
    .line 75
    return-void
.end method
