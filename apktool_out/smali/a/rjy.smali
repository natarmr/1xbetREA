.class public abstract La/rjy;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I

.field public c:Ljava/lang/String;

.field public d:B

.field public e:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, La/rjy;->a:I

    .line 6
    .line 7
    iput v0, p0, La/rjy;->b:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, La/rjy;->c:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a(Ljava/util/HashMap;)V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public abstract b()La/rjy;
.end method

.method public c(La/rjy;)La/rjy;
    .locals 1

    .line 1
    iget v0, p1, La/rjy;->a:I

    .line 2
    .line 3
    iput v0, p0, La/rjy;->a:I

    .line 4
    .line 5
    iget v0, p1, La/rjy;->b:I

    .line 6
    .line 7
    iput v0, p0, La/rjy;->b:I

    .line 8
    .line 9
    iget-object v0, p1, La/rjy;->c:Ljava/lang/String;

    .line 10
    .line 11
    iput-object v0, p0, La/rjy;->c:Ljava/lang/String;

    .line 12
    .line 13
    iget-byte v0, p1, La/rjy;->d:B

    .line 14
    .line 15
    iput-byte v0, p0, La/rjy;->d:B

    .line 16
    .line 17
    iget-object p1, p1, La/rjy;->e:Ljava/util/HashMap;

    .line 18
    .line 19
    iput-object p1, p0, La/rjy;->e:Ljava/util/HashMap;

    .line 20
    .line 21
    return-object p0
.end method

.method public d(Ljava/util/HashSet;)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract e(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end method

.method public f(Ljava/util/HashMap;)V
    .locals 0

    .line 1
    return-void
.end method
