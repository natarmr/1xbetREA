.class public final La/jvm0;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/ctf0;

.field public final c:La/p7m0;

.field public final d:La/ra10;

.field public final e:La/qoj0;

.field public final f:La/gmq;


# direct methods
.method public constructor <init>(La/mne;La/s1u;La/ctf0;La/sa10;)V
    .locals 6

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/w46;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p3, p0, La/jvm0;->b:La/ctf0;

    .line 8
    .line 9
    const-string p3, ""

    .line 10
    .line 11
    invoke-static {p3}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    iput-object p3, p0, La/jvm0;->c:La/p7m0;

    .line 16
    .line 17
    sget-object v1, La/pb10;->r1:La/pb10;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    const/16 v5, 0x1c

    .line 21
    .line 22
    const v2, 0x7f130e37

    .line 23
    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    move-object v0, p4

    .line 27
    invoke-static/range {v0 .. v5}, La/sa10;->b(La/sa10;La/pb10;IILkotlin/jvm/functions/Function0;I)La/ra10;

    .line 28
    .line 29
    .line 30
    move-result-object p4

    .line 31
    iput-object p4, p0, La/jvm0;->d:La/ra10;

    .line 32
    .line 33
    const/4 p4, 0x7

    .line 34
    const/4 v0, 0x0

    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-static {v0, v0, v1, p4}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 37
    .line 38
    .line 39
    move-result-object p4

    .line 40
    iput-object p4, p0, La/jvm0;->e:La/qoj0;

    .line 41
    .line 42
    invoke-virtual {p2}, La/s1u;->a()La/i89;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    new-instance p4, La/fe0;

    .line 47
    .line 48
    const/16 v0, 0x11

    .line 49
    .line 50
    invoke-direct {p4, p0, v1, v0}, La/fe0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 51
    .line 52
    .line 53
    new-instance v0, La/p6d;

    .line 54
    .line 55
    const/4 v2, 0x1

    .line 56
    invoke-direct {v0, p2, p3, p4, v2}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 57
    .line 58
    .line 59
    new-instance p2, La/pr60;

    .line 60
    .line 61
    const/4 p3, 0x3

    .line 62
    const/16 p4, 0x1b

    .line 63
    .line 64
    invoke-direct {p2, p3, v1, p4}, La/pr60;-><init>(ILa/yje;B)V

    .line 65
    .line 66
    .line 67
    new-instance p3, La/dnq;

    .line 68
    .line 69
    invoke-direct {p3, v0, p2, v2}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p1, La/mne;->a:La/rwj;

    .line 73
    .line 74
    invoke-static {p3, p1}, La/ulb;->L(La/gmq;Lkotlin/coroutines/CoroutineContext;)La/gmq;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iput-object p1, p0, La/jvm0;->f:La/gmq;

    .line 79
    .line 80
    return-void
.end method
