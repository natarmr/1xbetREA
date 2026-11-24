.class public final La/wjd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/clz;


# instance fields
.field public final a:La/glz;

.field public b:La/lkz;

.field public c:La/lkz;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/glz;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, p0, v1}, La/glz;-><init>(La/clz;Z)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, La/wjd;->a:La/glz;

    .line 11
    .line 12
    sget-object v0, La/lkz;->b:La/lkz;

    .line 13
    .line 14
    iput-object v0, p0, La/wjd;->b:La/lkz;

    .line 15
    .line 16
    iput-object v0, p0, La/wjd;->c:La/lkz;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, La/wjd;->b:La/lkz;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, La/wjd;->c:La/lkz;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-ge v0, v1, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, La/wjd;->b:La/lkz;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, La/wjd;->c:La/lkz;

    .line 19
    .line 20
    :goto_0
    iget-object p0, p0, La/wjd;->a:La/glz;

    .line 21
    .line 22
    iget-object v1, p0, La/glz;->i:La/lkz;

    .line 23
    .line 24
    sget-object v2, La/lkz;->b:La/lkz;

    .line 25
    .line 26
    if-ne v1, v2, :cond_1

    .line 27
    .line 28
    sget-object v1, La/lkz;->a:La/lkz;

    .line 29
    .line 30
    if-ne v0, v1, :cond_1

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    invoke-virtual {p0, v0}, La/glz;->g(La/lkz;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final x()La/glz;
    .locals 0

    .line 1
    iget-object p0, p0, La/wjd;->a:La/glz;

    .line 2
    .line 3
    return-object p0
.end method
