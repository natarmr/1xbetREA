.class public final La/zub;
.super La/sub;
.source "SourceFile"


# instance fields
.field public final a:I

.field public b:Z

.field public c:I


# direct methods
.method public constructor <init>(CC)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p2, p0, La/zub;->a:I

    .line 5
    .line 6
    if-gt p1, p2, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    iput-boolean v0, p0, La/zub;->b:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    move p1, p2

    .line 17
    :goto_1
    iput p1, p0, La/zub;->c:I

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a()C
    .locals 2

    .line 1
    iget v0, p0, La/zub;->c:I

    .line 2
    .line 3
    iget v1, p0, La/zub;->a:I

    .line 4
    .line 5
    if-ne v0, v1, :cond_1

    .line 6
    .line 7
    iget-boolean v1, p0, La/zub;->b:Z

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput-boolean v1, p0, La/zub;->b:Z

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {}, La/itt0;->a()V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    add-int/lit8 v1, v0, 0x1

    .line 21
    .line 22
    iput v1, p0, La/zub;->c:I

    .line 23
    .line 24
    :goto_0
    int-to-char p0, v0

    .line 25
    return p0
.end method

.method public final hasNext()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/zub;->b:Z

    .line 2
    .line 3
    return p0
.end method
