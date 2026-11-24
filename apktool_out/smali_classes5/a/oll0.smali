.class public final La/oll0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/wdk0;


# direct methods
.method public constructor <init>(La/wdk0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/oll0;->a:La/wdk0;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Landroidx/fragment/app/Fragment;La/nll0;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/xdk0;

    .line 5
    .line 6
    sget-object v1, La/pek0;->a:La/pek0;

    .line 7
    .line 8
    const p2, 0x7f1313ec    # 1.9549996E38f

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, p2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    const/16 v7, 0x7c

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v5, 0x0

    .line 24
    invoke-direct/range {v0 .. v7}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 25
    .line 26
    .line 27
    const/16 v7, 0x3fc

    .line 28
    .line 29
    iget-object p0, p0, La/oll0;->a:La/wdk0;

    .line 30
    .line 31
    const/4 v5, 0x0

    .line 32
    move-object v2, p1

    .line 33
    move-object v1, v0

    .line 34
    move-object v0, p0

    .line 35
    invoke-static/range {v0 .. v7}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 36
    .line 37
    .line 38
    return-void
.end method
