.class public final La/z28;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/vzg0;

.field public final c:La/i1w0;

.field public final d:Lorg/xplatform/security/api/presentation/models/BindEmailScreenParams;

.field public final e:La/zg;

.field public final f:La/m1e;

.field public final g:La/mne;

.field public final h:La/ol60;

.field public final i:La/p7m0;

.field public j:La/c4m0;


# direct methods
.method public constructor <init>(La/vzg0;La/i1w0;Lorg/xplatform/security/api/presentation/models/BindEmailScreenParams;La/zg;La/m1e;La/mne;)V
    .locals 0

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/w46;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/z28;->b:La/vzg0;

    .line 8
    .line 9
    iput-object p2, p0, La/z28;->c:La/i1w0;

    .line 10
    .line 11
    iput-object p3, p0, La/z28;->d:Lorg/xplatform/security/api/presentation/models/BindEmailScreenParams;

    .line 12
    .line 13
    iput-object p4, p0, La/z28;->e:La/zg;

    .line 14
    .line 15
    iput-object p5, p0, La/z28;->f:La/m1e;

    .line 16
    .line 17
    iput-object p6, p0, La/z28;->g:La/mne;

    .line 18
    .line 19
    new-instance p1, La/ol60;

    .line 20
    .line 21
    const/4 p2, 0x3

    .line 22
    invoke-direct {p1, p2}, La/ol60;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, La/z28;->h:La/ol60;

    .line 26
    .line 27
    new-instance p1, La/v28;

    .line 28
    .line 29
    iget-boolean p2, p3, Lorg/xplatform/security/api/presentation/models/BindEmailScreenParams;->b:Z

    .line 30
    .line 31
    const-string p3, ""

    .line 32
    .line 33
    const/4 p4, 0x0

    .line 34
    invoke-direct {p1, p3, p2, p4, p4}, La/v28;-><init>(Ljava/lang/String;ZZZ)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, La/z28;->i:La/p7m0;

    .line 42
    .line 43
    return-void
.end method
