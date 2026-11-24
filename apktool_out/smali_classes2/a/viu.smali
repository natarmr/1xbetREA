.class public final La/viu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ieu;


# direct methods
.method public synthetic constructor <init>(La/ieu;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/viu;->a:La/ieu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 6

    .line 1
    iget-object p0, p0, La/viu;->a:La/ieu;

    .line 2
    .line 3
    invoke-virtual {p0}, La/ieu;->b()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long p0, v0, v2

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    return-wide v0

    .line 18
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 19
    .line 20
    .line 21
    move-result-wide v2

    .line 22
    const-wide/16 v4, 0x3e8

    .line 23
    .line 24
    mul-long/2addr v0, v4

    .line 25
    add-long/2addr v0, v2

    .line 26
    return-wide v0
.end method
