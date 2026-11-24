.class public final La/ecg;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/fvt;

.field public final c:La/mne;

.field public final d:La/duj;

.field public final e:La/qoj0;

.field public final f:La/p7m0;


# direct methods
.method public constructor <init>(La/fvt;La/mne;La/duj;La/ctf0;)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/w46;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/ecg;->b:La/fvt;

    .line 8
    .line 9
    iput-object p2, p0, La/ecg;->c:La/mne;

    .line 10
    .line 11
    iput-object p3, p0, La/ecg;->d:La/duj;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    const/4 p2, 0x7

    .line 15
    const/4 p3, 0x0

    .line 16
    invoke-static {p3, p3, p1, p2}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, La/ecg;->e:La/qoj0;

    .line 21
    .line 22
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, La/ecg;->f:La/p7m0;

    .line 29
    .line 30
    return-void
.end method
