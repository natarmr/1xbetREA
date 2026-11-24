.class public final synthetic La/atl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:La/a4x;

.field public final synthetic c:La/lq5;

.field public final synthetic d:Z

.field public final synthetic e:La/xcz;

.field public final synthetic f:F

.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Integer;

.field public final synthetic i:Lkotlin/jvm/functions/Function2;

.field public final synthetic j:I

.field public final synthetic k:S


# direct methods
.method public synthetic constructor <init>(La/mm40;La/a4x;La/lq5;ZLa/xcz;FILjava/lang/Integer;Lkotlin/jvm/functions/Function2;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/atl;->a:La/mm40;

    iput-object p2, p0, La/atl;->b:La/a4x;

    iput-object p3, p0, La/atl;->c:La/lq5;

    iput-boolean p4, p0, La/atl;->d:Z

    iput-object p5, p0, La/atl;->e:La/xcz;

    iput p6, p0, La/atl;->f:F

    iput p7, p0, La/atl;->g:I

    iput-object p8, p0, La/atl;->h:Ljava/lang/Integer;

    iput-object p9, p0, La/atl;->i:Lkotlin/jvm/functions/Function2;

    iput p10, p0, La/atl;->j:I

    iput-short p11, p0, La/atl;->k:S

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object v9, p1

    .line 2
    check-cast v9, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, La/atl;->j:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v10

    .line 17
    iget-object v0, p0, La/atl;->a:La/mm40;

    .line 18
    .line 19
    iget-object v1, p0, La/atl;->b:La/a4x;

    .line 20
    .line 21
    iget-object v2, p0, La/atl;->c:La/lq5;

    .line 22
    .line 23
    iget-boolean v3, p0, La/atl;->d:Z

    .line 24
    .line 25
    iget-object v4, p0, La/atl;->e:La/xcz;

    .line 26
    .line 27
    iget v5, p0, La/atl;->f:F

    .line 28
    .line 29
    iget v6, p0, La/atl;->g:I

    .line 30
    .line 31
    iget-object v7, p0, La/atl;->h:Ljava/lang/Integer;

    .line 32
    .line 33
    iget-object v8, p0, La/atl;->i:Lkotlin/jvm/functions/Function2;

    .line 34
    .line 35
    iget-short v11, p0, La/atl;->k:S

    .line 36
    .line 37
    invoke-static/range {v0 .. v11}, La/etl;->e(La/mm40;La/a4x;La/lq5;ZLa/xcz;FILjava/lang/Integer;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0
.end method
