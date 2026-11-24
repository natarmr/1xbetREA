.class public final La/yp2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;

.field public volatile b:Ljava/lang/Object;

.field public volatile c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/qsn;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, La/yp2;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/y680;)V
    .locals 3

    .line 1
    new-instance v0, La/onk;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, La/bzs0;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-direct {v1, v2}, La/bzs0;-><init>(B)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, La/yp2;->c:Ljava/lang/Object;

    .line 16
    .line 17
    new-instance v0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, La/yp2;->a:Ljava/lang/Object;

    .line 23
    .line 24
    iput-object v1, p0, La/yp2;->b:Ljava/lang/Object;

    .line 25
    .line 26
    new-instance v0, La/xp2;

    .line 27
    .line 28
    invoke-direct {v0, p0}, La/xp2;-><init>(La/yp2;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, La/y680;->a(La/izj;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
