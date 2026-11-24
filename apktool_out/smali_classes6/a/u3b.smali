.class public final La/u3b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/z3b;


# static fields
.field public static final a:La/u3b;

.field public static final b:La/n3d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/u3b;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/u3b;->a:La/u3b;

    .line 7
    .line 8
    sget-object v0, La/n3d;->a:La/n3d;

    .line 9
    .line 10
    sput-object v0, La/u3b;->b:La/n3d;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()La/n3d;
    .locals 0

    .line 1
    sget-object p0, La/u3b;->b:La/n3d;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b(La/z3b;La/z3b;)Z
    .locals 0

    .line 1
    instance-of p0, p1, La/u3b;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    instance-of p0, p2, La/u3b;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final d(La/z3b;La/z3b;)Z
    .locals 0

    .line 1
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of p0, p1, La/u3b;

    .line 6
    .line 7
    if-nez p0, :cond_1

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_1
    return v0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    const p0, 0x7790aa77

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "CategoryCardShimmerModel"

    .line 2
    .line 3
    return-object p0
.end method
