.class public final La/d190;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/q7d0;

.field public final b:La/vby;

.field public c:Ljava/lang/String;

.field public d:I

.field public e:La/pwf0;

.field public final f:La/p7m0;

.field public final g:La/qoj0;


# direct methods
.method public constructor <init>(La/vby;La/q7d0;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, La/d190;->a:La/q7d0;

    .line 11
    .line 12
    iput-object p1, p0, La/d190;->b:La/vby;

    .line 13
    .line 14
    const-string p1, ""

    .line 15
    .line 16
    iput-object p1, p0, La/d190;->c:Ljava/lang/String;

    .line 17
    .line 18
    const/high16 p1, -0x80000000

    .line 19
    .line 20
    iput p1, p0, La/d190;->d:I

    .line 21
    .line 22
    sget-object p1, La/pwf0;->a:La/pwf0;

    .line 23
    .line 24
    iput-object p1, p0, La/d190;->e:La/pwf0;

    .line 25
    .line 26
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 27
    .line 28
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, La/d190;->f:La/p7m0;

    .line 33
    .line 34
    const/4 p1, 0x1

    .line 35
    sget-object p2, La/i99;->b:La/i99;

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    invoke-static {v0, p1, p2, p1}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, La/d190;->g:La/qoj0;

    .line 43
    .line 44
    return-void
.end method
