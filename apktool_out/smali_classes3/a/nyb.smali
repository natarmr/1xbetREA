.class public final La/nyb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ts4;


# direct methods
.method public synthetic constructor <init>(La/ts4;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/nyb;->a:La/ts4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    iget-object p0, p0, La/nyb;->a:La/ts4;

    .line 2
    .line 3
    iget-object p0, p0, La/ts4;->i:La/knf0;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/nyb;->a:La/ts4;

    .line 5
    .line 6
    iget-object p0, p0, La/ts4;->d:La/at4;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v0, La/zs4;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x3

    .line 15
    invoke-direct {v0, v1, v1, p1, v2}, La/zs4;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, La/at4;->f:La/zs4;

    .line 19
    .line 20
    new-instance p1, La/swp0;

    .line 21
    .line 22
    invoke-static {}, La/axq;->g()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, ""

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    invoke-direct {p1, v0, v1, v2}, La/swp0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, La/at4;->a:La/swp0;

    .line 33
    .line 34
    return-void
.end method
