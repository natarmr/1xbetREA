.class public final La/gkp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/p7m0;

.field public final b:La/ol60;

.field public final c:La/p7m0;

.field public final d:La/ol60;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/gkp;->a:La/p7m0;

    .line 11
    .line 12
    new-instance v0, La/ol60;

    .line 13
    .line 14
    const/4 v1, 0x3

    .line 15
    invoke-direct {v0, v1}, La/ol60;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, La/gkp;->b:La/ol60;

    .line 19
    .line 20
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, La/gkp;->c:La/p7m0;

    .line 27
    .line 28
    new-instance v0, La/ol60;

    .line 29
    .line 30
    invoke-direct {v0, v1}, La/ol60;-><init>(I)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, La/gkp;->d:La/ol60;

    .line 34
    .line 35
    return-void
.end method
