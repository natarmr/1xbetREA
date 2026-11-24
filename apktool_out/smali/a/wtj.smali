.class public final La/wtj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/wel;


# instance fields
.field public final a:La/ca6;

.field public final b:La/ov2;

.field public final c:La/g050;


# direct methods
.method public constructor <init>(La/ca6;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/wtj;->a:La/ca6;

    .line 5
    .line 6
    new-instance p1, La/ov2;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-direct {p1, p0, v0}, La/ov2;-><init>(Ljava/lang/Object;B)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La/wtj;->b:La/ov2;

    .line 13
    .line 14
    new-instance p1, La/g050;

    .line 15
    .line 16
    invoke-direct {p1}, La/g050;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, La/wtj;->c:La/g050;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a(La/ic1;La/xb2;)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, La/c050;->a:La/c050;

    .line 2
    .line 3
    new-instance v0, La/b1f;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, p0, p1, v1}, La/b1f;-><init>(La/wtj;La/ic1;La/yje;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p2, v0}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object p1, La/wne;->a:La/wne;

    .line 14
    .line 15
    if-ne p0, p1, :cond_0

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0
.end method
