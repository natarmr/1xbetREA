.class public final La/kt90;
.super La/diu0;
.source "SourceFile"


# instance fields
.field public final b:La/nr00;

.field public final c:La/ctf0;

.field public final d:La/qoj0;

.field public final e:La/p7m0;

.field public final f:La/qoj0;


# direct methods
.method public constructor <init>(La/nr00;La/ctf0;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/diu0;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/kt90;->b:La/nr00;

    .line 8
    .line 9
    iput-object p2, p0, La/kt90;->c:La/ctf0;

    .line 10
    .line 11
    sget-object p1, La/i99;->b:La/i99;

    .line 12
    .line 13
    const/4 p2, 0x1

    .line 14
    const/4 v0, 0x0

    .line 15
    const/4 v1, 0x2

    .line 16
    invoke-static {p2, v0, p1, v1}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, La/kt90;->d:La/qoj0;

    .line 21
    .line 22
    new-instance p1, La/lt90;

    .line 23
    .line 24
    const-string p2, ""

    .line 25
    .line 26
    invoke-direct {p1, p2, p2}, La/lt90;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, La/kt90;->e:La/p7m0;

    .line 34
    .line 35
    const/4 p1, 0x7

    .line 36
    const/4 p2, 0x0

    .line 37
    invoke-static {v0, v0, p2, p1}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, La/kt90;->f:La/qoj0;

    .line 42
    .line 43
    return-void
.end method
