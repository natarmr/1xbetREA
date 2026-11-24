.class public final synthetic La/cx40;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/pu90;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:La/pu90;

.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:La/pu90;

.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:Z


# direct methods
.method public synthetic constructor <init>(La/pu90;IILa/pu90;IILa/pu90;IIZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/cx40;->a:La/pu90;

    iput p2, p0, La/cx40;->b:I

    iput p3, p0, La/cx40;->c:I

    iput-object p4, p0, La/cx40;->d:La/pu90;

    iput p5, p0, La/cx40;->e:I

    iput p6, p0, La/cx40;->f:I

    iput-object p7, p0, La/cx40;->g:La/pu90;

    iput p8, p0, La/cx40;->h:I

    iput p9, p0, La/cx40;->i:I

    iput-boolean p10, p0, La/cx40;->j:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, La/ou90;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/cx40;->a:La/pu90;

    .line 7
    .line 8
    iget-boolean v1, p0, La/cx40;->j:Z

    .line 9
    .line 10
    iget v2, p0, La/cx40;->b:I

    .line 11
    .line 12
    iget v3, p0, La/cx40;->c:I

    .line 13
    .line 14
    invoke-static {v0, v1, p1, v2, v3}, La/kp2;->f(La/pu90;ZLa/ou90;II)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, La/cx40;->d:La/pu90;

    .line 18
    .line 19
    iget v2, p0, La/cx40;->e:I

    .line 20
    .line 21
    iget v3, p0, La/cx40;->f:I

    .line 22
    .line 23
    invoke-static {v0, v1, p1, v2, v3}, La/kp2;->f(La/pu90;ZLa/ou90;II)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, La/cx40;->g:La/pu90;

    .line 27
    .line 28
    iget v2, p0, La/cx40;->h:I

    .line 29
    .line 30
    iget p0, p0, La/cx40;->i:I

    .line 31
    .line 32
    invoke-static {v0, v1, p1, v2, p0}, La/kp2;->f(La/pu90;ZLa/ou90;II)V

    .line 33
    .line 34
    .line 35
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p0
.end method
