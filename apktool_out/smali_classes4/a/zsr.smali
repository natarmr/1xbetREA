.class public final La/zsr;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:La/lut;

.field public final c:La/mpx;

.field public final d:La/mpx;

.field public final e:La/sdi0;

.field public final f:La/xsc;

.field public final g:La/yqc;


# direct methods
.method public constructor <init>(Landroid/content/Context;La/lut;La/mpx;La/mpx;La/sdi0;La/xsc;La/yqc;)V
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
    iput-object p1, p0, La/zsr;->a:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, La/zsr;->b:La/lut;

    .line 10
    .line 11
    iput-object p3, p0, La/zsr;->c:La/mpx;

    .line 12
    .line 13
    iput-object p4, p0, La/zsr;->d:La/mpx;

    .line 14
    .line 15
    iput-object p5, p0, La/zsr;->e:La/sdi0;

    .line 16
    .line 17
    iput-object p6, p0, La/zsr;->f:La/xsc;

    .line 18
    .line 19
    iput-object p7, p0, La/zsr;->g:La/yqc;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    sget v0, Lorg/xplatform/game_broadcasting/impl/presentation/video/window_screen/GameVideoWindowService;->k:I

    .line 2
    .line 3
    iget-object v0, p0, La/zsr;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-static {v0}, La/pzb;->o0(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    sget v1, Lorg/xplatform/game_broadcasting/impl/presentation/zone/window_screen/GameZoneWindowService;->g:I

    .line 9
    .line 10
    invoke-static {v0}, La/u1c;->P(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/zsr;->d:La/mpx;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, v1}, La/mpx;->b(Z)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, La/zsr;->f:La/xsc;

    .line 20
    .line 21
    invoke-virtual {v0}, La/xsc;->b()V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, La/zsr;->e:La/sdi0;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, La/sdi0;->b(Z)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, La/zsr;->g:La/yqc;

    .line 30
    .line 31
    invoke-virtual {p0}, La/yqc;->v()V

    .line 32
    .line 33
    .line 34
    return-void
.end method
