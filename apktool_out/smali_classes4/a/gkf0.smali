.class public final La/gkf0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:La/ncz;

.field public final synthetic b:La/ma80;


# direct methods
.method public constructor <init>(La/ncz;La/ma80;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/gkf0;->a:La/ncz;

    .line 5
    .line 6
    iput-object p2, p0, La/gkf0;->b:La/ma80;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 4

    .line 1
    iget-object v0, p0, La/gkf0;->a:La/ncz;

    .line 2
    .line 3
    iget v0, v0, La/ncz;->p:I

    .line 4
    .line 5
    iget-object p0, p0, La/gkf0;->b:La/ma80;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-ne p0, v1, :cond_0

    .line 15
    .line 16
    int-to-long v0, v0

    .line 17
    const/16 p0, 0x20

    .line 18
    .line 19
    shl-long/2addr v0, p0

    .line 20
    return-wide v0

    .line 21
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 22
    .line 23
    .line 24
    const-wide/16 v0, 0x0

    .line 25
    .line 26
    return-wide v0

    .line 27
    :cond_1
    int-to-long v0, v0

    .line 28
    const-wide v2, 0xffffffffL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    and-long/2addr v0, v2

    .line 34
    return-wide v0
.end method

.method public final b()J
    .locals 4

    .line 1
    iget-object v0, p0, La/gkf0;->a:La/ncz;

    .line 2
    .line 3
    iget v0, v0, La/ncz;->q:I

    .line 4
    .line 5
    iget-object p0, p0, La/gkf0;->b:La/ma80;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-ne p0, v1, :cond_0

    .line 15
    .line 16
    int-to-long v0, v0

    .line 17
    const/16 p0, 0x20

    .line 18
    .line 19
    shl-long/2addr v0, p0

    .line 20
    return-wide v0

    .line 21
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 22
    .line 23
    .line 24
    const-wide/16 v0, 0x0

    .line 25
    .line 26
    return-wide v0

    .line 27
    :cond_1
    int-to-long v0, v0

    .line 28
    const-wide v2, 0xffffffffL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    and-long/2addr v0, v2

    .line 34
    return-wide v0
.end method
