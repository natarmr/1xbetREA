.class public final La/f190;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/ol60;

.field public final c:La/ol60;

.field public final d:La/p7m0;


# direct methods
.method public constructor <init>(La/vzg0;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/w46;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance p1, La/ol60;

    .line 8
    .line 9
    sget-object v0, La/i99;->b:La/i99;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {p1, v1, v0}, La/ol60;-><init>(ILa/i99;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, La/f190;->b:La/ol60;

    .line 16
    .line 17
    new-instance p1, La/ol60;

    .line 18
    .line 19
    invoke-direct {p1, v1, v0}, La/ol60;-><init>(ILa/i99;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/f190;->c:La/ol60;

    .line 23
    .line 24
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, La/f190;->d:La/p7m0;

    .line 31
    .line 32
    return-void
.end method
