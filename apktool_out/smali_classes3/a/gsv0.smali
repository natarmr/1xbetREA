.class public final synthetic La/gsv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/fer;


# instance fields
.field public final synthetic a:La/hsv0;


# direct methods
.method public constructor <init>(La/hsv0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/gsv0;->a:La/hsv0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b()La/wdr;
    .locals 7

    .line 1
    new-instance v0, La/rer;

    .line 2
    .line 3
    const-string v5, "removeRoutes(Ljava/util/List;)V"

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    iget-object v2, p0, La/gsv0;->a:La/hsv0;

    .line 8
    .line 9
    const-class v3, La/hsv0;

    .line 10
    .line 11
    const-string v4, "removeRoutes"

    .line 12
    .line 13
    invoke-direct/range {v0 .. v6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, La/gsv0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, La/gsv0;->b()La/wdr;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p1, La/fer;

    .line 10
    .line 11
    invoke-interface {p1}, La/fer;->b()La/wdr;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    invoke-virtual {p0}, La/gsv0;->b()La/wdr;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method
