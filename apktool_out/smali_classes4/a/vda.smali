.class public final synthetic La/vda;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:I

.field public final synthetic c:Z

.field public final synthetic d:Z

.field public final synthetic e:F

.field public final synthetic f:F

.field public final synthetic g:F

.field public final synthetic h:F

.field public final synthetic i:F


# direct methods
.method public synthetic constructor <init>(La/mm40;IZZFFFFFI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/vda;->a:La/mm40;

    iput p2, p0, La/vda;->b:I

    iput-boolean p3, p0, La/vda;->c:Z

    iput-boolean p4, p0, La/vda;->d:Z

    iput p5, p0, La/vda;->e:F

    iput p6, p0, La/vda;->f:F

    iput p7, p0, La/vda;->g:F

    iput p8, p0, La/vda;->h:F

    iput p9, p0, La/vda;->i:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

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
    const/4 p1, 0x1

    .line 10
    invoke-static {p1}, La/x8x;->L(I)I

    .line 11
    .line 12
    .line 13
    move-result v10

    .line 14
    iget-object v0, p0, La/vda;->a:La/mm40;

    .line 15
    .line 16
    iget v1, p0, La/vda;->b:I

    .line 17
    .line 18
    iget-boolean v2, p0, La/vda;->c:Z

    .line 19
    .line 20
    iget-boolean v3, p0, La/vda;->d:Z

    .line 21
    .line 22
    iget v4, p0, La/vda;->e:F

    .line 23
    .line 24
    iget v5, p0, La/vda;->f:F

    .line 25
    .line 26
    iget v6, p0, La/vda;->g:F

    .line 27
    .line 28
    iget v7, p0, La/vda;->h:F

    .line 29
    .line 30
    iget v8, p0, La/vda;->i:F

    .line 31
    .line 32
    invoke-static/range {v0 .. v10}, La/dea;->a(La/mm40;IZZFFFFFLa/fet;I)V

    .line 33
    .line 34
    .line 35
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p0
.end method
