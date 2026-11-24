.class public final synthetic La/nr3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/h2r;


# instance fields
.field public final synthetic a:Lorg/xplatform/client1/features/appactivity/ApplicationActivity;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/nr3;->a:Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    return-void
.end method


# virtual methods
.method public final a(Landroidx/fragment/app/e;Landroidx/fragment/app/Fragment;)V
    .locals 1

    .line 1
    sget v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F1:I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance p1, La/vr3;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iget-object p0, p0, La/nr3;->a:Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 10
    .line 11
    invoke-direct {p1, p0, v0}, La/vr3;-><init>(Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const/4 p2, 0x1

    .line 19
    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/e;->k0(La/q1r;Z)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
