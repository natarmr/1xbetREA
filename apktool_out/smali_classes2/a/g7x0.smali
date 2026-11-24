.class public final synthetic La/g7x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/yy3;


# instance fields
.field public final synthetic a:La/l7x0;

.field public final synthetic b:La/r7x0;


# direct methods
.method public synthetic constructor <init>(La/l7x0;La/r7x0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/g7x0;->a:La/l7x0;

    .line 5
    .line 6
    iput-object p2, p0, La/g7x0;->b:La/r7x0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)La/ig00;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    iget-object p1, p0, La/g7x0;->a:La/l7x0;

    .line 4
    .line 5
    iget-object v0, p1, La/l7x0;->d:La/lin0;

    .line 6
    .line 7
    invoke-interface {v0}, La/lin0;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, La/y2x0;

    .line 12
    .line 13
    new-instance v1, La/k7x0;

    .line 14
    .line 15
    iget-object p0, p0, La/g7x0;->b:La/r7x0;

    .line 16
    .line 17
    invoke-direct {v1, p1, p0}, La/k7x0;-><init>(La/l7x0;La/r7x0;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, La/y2x0;->a(La/k7x0;)La/d1;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method
