.class public final La/qrc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/nv20;


# direct methods
.method public synthetic constructor <init>(La/nv20;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/qrc;->a:La/nv20;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Date;Z)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/qrc;->a:La/nv20;

    .line 5
    .line 6
    iget-object p0, p0, La/nv20;->a:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, La/u5g0;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, La/u5g0;->b:La/p7m0;

    .line 17
    .line 18
    invoke-virtual {p0, v0, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object p0, p0, La/u5g0;->a:La/p7m0;

    .line 23
    .line 24
    invoke-virtual {p0, v0, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    return-void
.end method
