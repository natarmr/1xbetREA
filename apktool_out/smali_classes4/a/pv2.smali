.class public final La/pv2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/wel;


# instance fields
.field public final a:La/ov2;

.field public final synthetic b:La/qv2;


# direct methods
.method public constructor <init>(La/qv2;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/pv2;->b:La/qv2;

    .line 5
    .line 6
    new-instance v0, La/ov2;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p1, v1}, La/ov2;-><init>(Ljava/lang/Object;B)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, La/pv2;->a:La/ov2;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(La/ic1;La/xb2;)Ljava/lang/Object;
    .locals 3

    .line 1
    sget-object v0, La/c050;->b:La/c050;

    .line 2
    .line 3
    new-instance v1, La/ko0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p0, p1, v2}, La/ko0;-><init>(La/pv2;La/ic1;La/yje;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/pv2;->b:La/qv2;

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1, p2}, La/qv2;->a(La/c050;La/ko0;La/zje;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object p1, La/wne;->a:La/wne;

    .line 16
    .line 17
    if-ne p0, p1, :cond_0

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0
.end method
