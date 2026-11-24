.class public final La/gui;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/vpk0;


# instance fields
.field public final a:La/cad;

.field public final b:La/knf0;

.field public final c:La/gii0;

.field public final d:La/n5d0;


# direct methods
.method public constructor <init>(La/cad;La/knf0;La/gii0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/gui;->a:La/cad;

    .line 5
    .line 6
    iput-object p2, p0, La/gui;->b:La/knf0;

    .line 7
    .line 8
    iput-object p3, p0, La/gui;->c:La/gii0;

    .line 9
    .line 10
    new-instance p1, La/rti;

    .line 11
    .line 12
    const/4 p2, 0x5

    .line 13
    invoke-direct {p1, p0, p2}, La/rti;-><init>(Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, La/gui;->d:La/n5d0;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a()La/hnu;
    .locals 1

    .line 1
    iget-object p0, p0, La/gui;->d:La/n5d0;

    .line 2
    .line 3
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/w1e0;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v0, La/hnu;

    .line 13
    .line 14
    invoke-direct {v0, p0}, La/hnu;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final b()La/do20;
    .locals 1

    .line 1
    iget-object p0, p0, La/gui;->d:La/n5d0;

    .line 2
    .line 3
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/w1e0;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance v0, La/do20;

    .line 13
    .line 14
    invoke-direct {v0, p0}, La/do20;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method
