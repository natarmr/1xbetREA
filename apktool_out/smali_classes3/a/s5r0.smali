.class public final La/s5r0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ir30;

.field public final b:La/ir30;

.field public final c:La/p7m0;

.field public final d:La/qoj0;


# direct methods
.method public constructor <init>(La/mne;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/ir30;

    .line 5
    .line 6
    iget-object p1, p1, La/mne;->b:La/dvj;

    .line 7
    .line 8
    const-wide/32 v1, 0x1d4c0

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, p1, v1, v2}, La/ir30;-><init>(La/lne;J)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/s5r0;->a:La/ir30;

    .line 15
    .line 16
    new-instance v0, La/ir30;

    .line 17
    .line 18
    invoke-direct {v0, p1, v1, v2}, La/ir30;-><init>(La/lne;J)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, La/s5r0;->b:La/ir30;

    .line 22
    .line 23
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, La/s5r0;->c:La/p7m0;

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    const/4 v0, 0x7

    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-static {v1, v1, p1, v0}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, La/s5r0;->d:La/qoj0;

    .line 39
    .line 40
    return-void
.end method
