.class public final synthetic La/p8d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:La/d9d0;

.field public final synthetic b:Z

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:La/yjj0;


# direct methods
.method public synthetic constructor <init>(La/d9d0;ZFFLa/yjj0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/p8d0;->a:La/d9d0;

    iput-boolean p2, p0, La/p8d0;->b:Z

    iput p3, p0, La/p8d0;->c:F

    iput p4, p0, La/p8d0;->d:F

    iput-object p5, p0, La/p8d0;->e:La/yjj0;

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    check-cast p1, La/vj30;

    .line 2
    .line 3
    check-cast p2, La/pj30;

    .line 4
    .line 5
    check-cast p3, La/p4e;

    .line 6
    .line 7
    iget-wide v0, p3, La/p4e;->a:J

    .line 8
    .line 9
    invoke-interface {p2, v0, v1}, La/pj30;->S(J)La/pu90;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    iget p2, v3, La/pu90;->a:I

    .line 14
    .line 15
    iget p3, v3, La/pu90;->b:I

    .line 16
    .line 17
    new-instance v2, La/r8d0;

    .line 18
    .line 19
    iget-object v4, p0, La/p8d0;->a:La/d9d0;

    .line 20
    .line 21
    iget-boolean v5, p0, La/p8d0;->b:Z

    .line 22
    .line 23
    iget v6, p0, La/p8d0;->c:F

    .line 24
    .line 25
    iget v7, p0, La/p8d0;->d:F

    .line 26
    .line 27
    iget-object v8, p0, La/p8d0;->e:La/yjj0;

    .line 28
    .line 29
    invoke-direct/range {v2 .. v8}, La/r8d0;-><init>(La/pu90;La/d9d0;ZFFLa/yjj0;)V

    .line 30
    .line 31
    .line 32
    invoke-static {p1, p2, p3, v2}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method
