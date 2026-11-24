.class public final synthetic La/yj60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/pu90;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:Z

.field public final synthetic e:La/pu90;

.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:La/k6z;

.field public final synthetic i:Z

.field public final synthetic j:Z


# direct methods
.method public synthetic constructor <init>(La/pu90;IIZLa/pu90;IILa/k6z;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/yj60;->a:La/pu90;

    iput p2, p0, La/yj60;->b:I

    iput p3, p0, La/yj60;->c:I

    iput-boolean p4, p0, La/yj60;->d:Z

    iput-object p5, p0, La/yj60;->e:La/pu90;

    iput p6, p0, La/yj60;->f:I

    iput p7, p0, La/yj60;->g:I

    iput-object p8, p0, La/yj60;->h:La/k6z;

    iput-boolean p9, p0, La/yj60;->i:Z

    iput-boolean p10, p0, La/yj60;->j:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, La/ou90;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iget-object v1, p0, La/yj60;->a:La/pu90;

    .line 9
    .line 10
    iget v2, p0, La/yj60;->b:I

    .line 11
    .line 12
    iget v3, p0, La/yj60;->c:I

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2, v3, p1}, La/ou90;->m(La/pu90;IIF)V

    .line 15
    .line 16
    .line 17
    iget-boolean p1, p0, La/yj60;->d:Z

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    new-instance v4, La/cj;

    .line 22
    .line 23
    const/4 p1, 0x5

    .line 24
    iget-object v1, p0, La/yj60;->h:La/k6z;

    .line 25
    .line 26
    iget-boolean v2, p0, La/yj60;->i:Z

    .line 27
    .line 28
    iget-boolean v3, p0, La/yj60;->j:Z

    .line 29
    .line 30
    invoke-direct {v4, p1, v1, v2, v3}, La/cj;-><init>(BLjava/lang/Object;ZZ)V

    .line 31
    .line 32
    .line 33
    const/4 v5, 0x4

    .line 34
    iget-object v1, p0, La/yj60;->e:La/pu90;

    .line 35
    .line 36
    iget v2, p0, La/yj60;->f:I

    .line 37
    .line 38
    iget v3, p0, La/yj60;->g:I

    .line 39
    .line 40
    invoke-static/range {v0 .. v5}, La/ou90;->w(La/ou90;La/pu90;IILa/cj;I)V

    .line 41
    .line 42
    .line 43
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0
.end method
