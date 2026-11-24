.class public final La/g9c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pbt;


# direct methods
.method public constructor <init>(La/pbt;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/g9c;->a:La/pbt;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(La/ql5;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, La/ql5;->i:La/txs0;

    .line 5
    .line 6
    invoke-virtual {p1}, La/txs0;->a()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, La/g9c;->a:La/pbt;

    .line 13
    .line 14
    iget-object p0, p0, La/pbt;->a:La/j5t;

    .line 15
    .line 16
    iget-boolean p0, p0, La/j5t;->v:Z

    .line 17
    .line 18
    if-nez p0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p1}, La/txs0;->f()Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    :goto_0
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :cond_1
    const/4 p0, 0x0

    .line 30
    return p0
.end method
