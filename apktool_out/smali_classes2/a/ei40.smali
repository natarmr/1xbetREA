.class public final synthetic La/ei40;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:F

.field public final synthetic f:F

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(IJFFFFI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/ei40;->a:I

    iput-wide p2, p0, La/ei40;->b:J

    iput p4, p0, La/ei40;->c:F

    iput p5, p0, La/ei40;->d:F

    iput p6, p0, La/ei40;->e:F

    iput p7, p0, La/ei40;->f:F

    iput p8, p0, La/ei40;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    move-object v7, p1

    .line 2
    check-cast v7, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    iget p1, p0, La/ei40;->g:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v8

    .line 17
    iget v0, p0, La/ei40;->a:I

    .line 18
    .line 19
    iget-wide v1, p0, La/ei40;->b:J

    .line 20
    .line 21
    iget v3, p0, La/ei40;->c:F

    .line 22
    .line 23
    iget v4, p0, La/ei40;->d:F

    .line 24
    .line 25
    iget v5, p0, La/ei40;->e:F

    .line 26
    .line 27
    iget v6, p0, La/ei40;->f:F

    .line 28
    .line 29
    invoke-static/range {v0 .. v8}, La/x9x;->j(IJFFFFLa/fet;I)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0
.end method
