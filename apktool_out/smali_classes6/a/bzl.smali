.class public final La/bzl;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/oyq0;

.field public final b:La/sjj;

.field public final c:La/nul0;

.field public final d:La/pz40;

.field public final e:La/l7m0;

.field public final f:La/a8z;


# direct methods
.method public constructor <init>(La/oyq0;La/sjj;La/nul0;)V
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
    iput-object p1, p0, La/bzl;->a:La/oyq0;

    .line 8
    .line 9
    iput-object p2, p0, La/bzl;->b:La/sjj;

    .line 10
    .line 11
    iput-object p3, p0, La/bzl;->c:La/nul0;

    .line 12
    .line 13
    new-instance p1, La/j6g0;

    .line 14
    .line 15
    const/16 p2, 0x11

    .line 16
    .line 17
    invoke-direct {p1, p2}, La/j6g0;-><init>(B)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, La/bzl;->d:La/pz40;

    .line 25
    .line 26
    iput-object p1, p0, La/bzl;->e:La/l7m0;

    .line 27
    .line 28
    new-instance p1, La/yra;

    .line 29
    .line 30
    const/4 p2, 0x2

    .line 31
    invoke-direct {p1, p0, p2}, La/yra;-><init>(La/bzl;B)V

    .line 32
    .line 33
    .line 34
    sget-object p2, La/wez;->b:La/wez;

    .line 35
    .line 36
    invoke-static {p2, p1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, La/bzl;->f:La/a8z;

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final a(Lkotlin/jvm/functions/Function0;)La/azl;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/bzl;->d:La/pz40;

    .line 5
    .line 6
    check-cast v0, La/hgk0;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance p1, La/azl;

    .line 12
    .line 13
    iget-object v0, p0, La/bzl;->b:La/sjj;

    .line 14
    .line 15
    iget-object v1, p0, La/bzl;->c:La/nul0;

    .line 16
    .line 17
    iget-object v2, p0, La/bzl;->a:La/oyq0;

    .line 18
    .line 19
    invoke-direct {p1, p0, v2, v0, v1}, La/azl;-><init>(La/bzl;La/oyq0;La/sjj;La/nul0;)V

    .line 20
    .line 21
    .line 22
    return-object p1
.end method
