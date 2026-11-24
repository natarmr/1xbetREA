.class public final La/txk;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/kxk;

.field public final c:La/rpt;

.field public final d:La/mne;

.field public final e:La/p7m0;

.field public final f:La/ol60;


# direct methods
.method public constructor <init>(La/kxk;La/rpt;La/mne;La/ctf0;La/vzg0;)V
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
    iput-object p1, p0, La/txk;->b:La/kxk;

    .line 8
    .line 9
    iput-object p2, p0, La/txk;->c:La/rpt;

    .line 10
    .line 11
    iput-object p3, p0, La/txk;->d:La/mne;

    .line 12
    .line 13
    new-instance p1, La/oxk;

    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    new-array p3, p2, [Ljava/lang/Object;

    .line 17
    .line 18
    iget-object p4, p4, La/ctf0;->b:La/lsm0;

    .line 19
    .line 20
    invoke-static {p3, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    const p3, 0x7f130177

    .line 25
    .line 26
    .line 27
    invoke-virtual {p4, p3, p2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    const/4 p3, 0x1

    .line 32
    sget-object p4, La/lak0;->c:La/lak0;

    .line 33
    .line 34
    invoke-direct {p1, p4, p2, p3}, La/oxk;-><init>(La/a4x;Ljava/lang/String;Z)V

    .line 35
    .line 36
    .line 37
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, La/txk;->e:La/p7m0;

    .line 42
    .line 43
    new-instance p1, La/ol60;

    .line 44
    .line 45
    const/4 p2, 0x3

    .line 46
    invoke-direct {p1, p2}, La/ol60;-><init>(I)V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, La/txk;->f:La/ol60;

    .line 50
    .line 51
    return-void
.end method
