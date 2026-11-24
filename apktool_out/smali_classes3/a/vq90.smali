.class public final synthetic La/vq90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:F

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:La/ar90;

.field public final synthetic e:La/xcz;

.field public final synthetic f:I

.field public final synthetic g:F

.field public final synthetic h:La/gy40;

.field public final synthetic i:F

.field public final synthetic j:Lkotlin/jvm/functions/Function0;

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(La/mm40;FLjava/lang/String;La/ar90;La/xcz;IFLa/gy40;FLkotlin/jvm/functions/Function0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/vq90;->a:La/mm40;

    iput p2, p0, La/vq90;->b:F

    iput-object p3, p0, La/vq90;->c:Ljava/lang/String;

    iput-object p4, p0, La/vq90;->d:La/ar90;

    iput-object p5, p0, La/vq90;->e:La/xcz;

    iput p6, p0, La/vq90;->f:I

    iput p7, p0, La/vq90;->g:F

    iput-object p8, p0, La/vq90;->h:La/gy40;

    iput p9, p0, La/vq90;->i:F

    iput-object p10, p0, La/vq90;->j:Lkotlin/jvm/functions/Function0;

    iput p11, p0, La/vq90;->k:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object v10, p1

    .line 2
    check-cast v10, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, La/vq90;->k:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v11

    .line 17
    iget-object v0, p0, La/vq90;->a:La/mm40;

    .line 18
    .line 19
    iget v1, p0, La/vq90;->b:F

    .line 20
    .line 21
    iget-object v2, p0, La/vq90;->c:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v3, p0, La/vq90;->d:La/ar90;

    .line 24
    .line 25
    iget-object v4, p0, La/vq90;->e:La/xcz;

    .line 26
    .line 27
    iget v5, p0, La/vq90;->f:I

    .line 28
    .line 29
    iget v6, p0, La/vq90;->g:F

    .line 30
    .line 31
    iget-object v7, p0, La/vq90;->h:La/gy40;

    .line 32
    .line 33
    iget v8, p0, La/vq90;->i:F

    .line 34
    .line 35
    iget-object v9, p0, La/vq90;->j:Lkotlin/jvm/functions/Function0;

    .line 36
    .line 37
    invoke-static/range {v0 .. v11}, La/c9x;->g(La/mm40;FLjava/lang/String;La/ar90;La/xcz;IFLa/gy40;FLkotlin/jvm/functions/Function0;La/fet;I)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0
.end method
