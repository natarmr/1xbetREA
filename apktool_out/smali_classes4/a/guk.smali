.class public final La/guk;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:La/mne;

.field public final e:La/p4u;

.field public final f:La/dq00;

.field public g:La/bby;

.field public final h:La/p7m0;


# direct methods
.method public constructor <init>(La/vzg0;ILjava/lang/String;La/mne;La/p4u;La/dq00;La/g2v;)V
    .locals 8

    .line 1
    invoke-direct {p0}, La/w46;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p2, p0, La/guk;->b:I

    .line 5
    .line 6
    iput-object p3, p0, La/guk;->c:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p4, p0, La/guk;->d:La/mne;

    .line 9
    .line 10
    iput-object p5, p0, La/guk;->e:La/p4u;

    .line 11
    .line 12
    iput-object p6, p0, La/guk;->f:La/dq00;

    .line 13
    .line 14
    new-instance p2, La/nuk;

    .line 15
    .line 16
    sget-object p3, La/iun;->a:La/iun;

    .line 17
    .line 18
    const-string p5, "KEY_SEARCH_QUERY"

    .line 19
    .line 20
    invoke-virtual {p1, p5}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Ljava/lang/String;

    .line 25
    .line 26
    if-nez p1, :cond_0

    .line 27
    .line 28
    const-string p1, ""

    .line 29
    .line 30
    :cond_0
    sget-object v1, La/pb10;->r1:La/pb10;

    .line 31
    .line 32
    sget-object v2, La/okm;->c:La/okm;

    .line 33
    .line 34
    const/4 v6, 0x0

    .line 35
    const/16 v7, 0x1dc

    .line 36
    .line 37
    const/4 v3, 0x0

    .line 38
    const v4, 0x7f130e37

    .line 39
    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    move-object v0, p7

    .line 43
    invoke-static/range {v0 .. v7}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 44
    .line 45
    .line 46
    move-result-object p5

    .line 47
    invoke-direct {p2, p3, p1, p5}, La/nuk;-><init>(Ljava/util/List;Ljava/lang/String;La/jkm;)V

    .line 48
    .line 49
    .line 50
    invoke-static {p2}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iput-object p1, p0, La/guk;->h:La/p7m0;

    .line 55
    .line 56
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    iget-object p5, p4, La/mne;->a:La/rwj;

    .line 61
    .line 62
    new-instance p3, La/e3j;

    .line 63
    .line 64
    const/16 p1, 0x11

    .line 65
    .line 66
    invoke-direct {p3, p0, p1}, La/e3j;-><init>(Ljava/lang/Object;B)V

    .line 67
    .line 68
    .line 69
    new-instance p6, La/hij;

    .line 70
    .line 71
    const/4 p1, 0x0

    .line 72
    const/4 p4, 0x6

    .line 73
    invoke-direct {p6, p0, p1, p4}, La/hij;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 74
    .line 75
    .line 76
    const/16 p7, 0xa

    .line 77
    .line 78
    const/4 p4, 0x0

    .line 79
    invoke-static/range {p2 .. p7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 80
    .line 81
    .line 82
    return-void
.end method
