.class public final La/xrt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/nv20;


# direct methods
.method public constructor <init>(La/nv20;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/xrt;->a:La/nv20;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    iget-object p0, p0, La/xrt;->a:La/nv20;

    .line 2
    .line 3
    iget-object p0, p0, La/nv20;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/of6;

    .line 6
    .line 7
    iget-object p0, p0, La/of6;->a:La/q7d0;

    .line 8
    .line 9
    const-string v0, "showBannerFeed"

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-static {p0, v0, v1}, La/axq;->z(La/q7d0;Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method
