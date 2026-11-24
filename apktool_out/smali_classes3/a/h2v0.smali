.class public final La/h2v0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/c2v0;

.field public final c:La/pyu;

.field public final d:La/mne;

.field public final e:La/ol60;

.field public final f:La/p7m0;


# direct methods
.method public constructor <init>(La/mne;La/ntu;La/pyu;La/g2v;La/c2v0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, La/w46;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p5, p0, La/h2v0;->b:La/c2v0;

    .line 5
    .line 6
    iput-object p3, p0, La/h2v0;->c:La/pyu;

    .line 7
    .line 8
    iput-object p1, p0, La/h2v0;->d:La/mne;

    .line 9
    .line 10
    new-instance p3, La/ol60;

    .line 11
    .line 12
    const/4 v0, 0x3

    .line 13
    invoke-direct {p3, v0}, La/ol60;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iput-object p3, p0, La/h2v0;->e:La/ol60;

    .line 17
    .line 18
    invoke-virtual {p2}, La/ntu;->a()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    const-string p3, "/hd-api/checker"

    .line 23
    .line 24
    invoke-static {p2, p3}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    iget-object p3, p5, La/c2v0;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result p5

    .line 34
    if-nez p5, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const-string p5, "?ect="

    .line 38
    .line 39
    invoke-static {p2, p5, p3}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    :goto_0
    invoke-static {p2}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    iput-object p2, p0, La/h2v0;->f:La/p7m0;

    .line 48
    .line 49
    iget-object p2, p4, La/g2v;->a:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p2, La/gr00;

    .line 52
    .line 53
    iget-object p2, p2, La/gr00;->d:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p2, La/p2v0;

    .line 56
    .line 57
    iget-object p2, p2, La/p2v0;->a:La/qoj0;

    .line 58
    .line 59
    new-instance p3, La/rtq0;

    .line 60
    .line 61
    const/16 p4, 0x1a

    .line 62
    .line 63
    const/4 p5, 0x0

    .line 64
    invoke-direct {p3, p0, p5, p4}, La/rtq0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 65
    .line 66
    .line 67
    new-instance p4, La/fnq;

    .line 68
    .line 69
    const/4 v1, 0x4

    .line 70
    invoke-direct {p4, p2, p3, v1}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 71
    .line 72
    .line 73
    new-instance p2, La/pyn0;

    .line 74
    .line 75
    const/4 p3, 0x6

    .line 76
    invoke-direct {p2, v0, p5, p3}, La/pyn0;-><init>(ILa/yje;B)V

    .line 77
    .line 78
    .line 79
    new-instance p3, La/dnq;

    .line 80
    .line 81
    const/4 p5, 0x1

    .line 82
    invoke-direct {p3, p4, p2, p5}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 83
    .line 84
    .line 85
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    iget-object p1, p1, La/mne;->a:La/rwj;

    .line 90
    .line 91
    invoke-static {p0, p1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {p3, p0}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 96
    .line 97
    .line 98
    return-void
.end method
