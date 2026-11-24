.class public final synthetic La/vq40;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:Ljava/util/Locale;

.field public final synthetic e:La/yq40;

.field public final synthetic f:Z

.field public final synthetic g:Z

.field public final synthetic h:La/gy40;

.field public final synthetic i:La/br8;

.field public final synthetic j:Lkotlin/jvm/functions/Function0;

.field public final synthetic k:Lkotlin/jvm/functions/Function0;

.field public final synthetic l:Lkotlin/jvm/functions/Function0;

.field public final synthetic m:I


# direct methods
.method public synthetic constructor <init>(La/mm40;IILjava/util/Locale;La/yq40;ZZLa/gy40;La/br8;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/vq40;->a:La/mm40;

    iput p2, p0, La/vq40;->b:I

    iput p3, p0, La/vq40;->c:I

    iput-object p4, p0, La/vq40;->d:Ljava/util/Locale;

    iput-object p5, p0, La/vq40;->e:La/yq40;

    iput-boolean p6, p0, La/vq40;->f:Z

    iput-boolean p7, p0, La/vq40;->g:Z

    iput-object p8, p0, La/vq40;->h:La/gy40;

    iput-object p9, p0, La/vq40;->i:La/br8;

    iput-object p10, p0, La/vq40;->j:Lkotlin/jvm/functions/Function0;

    iput-object p11, p0, La/vq40;->k:Lkotlin/jvm/functions/Function0;

    iput-object p12, p0, La/vq40;->l:Lkotlin/jvm/functions/Function0;

    iput p13, p0, La/vq40;->m:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object v12, p1

    .line 2
    check-cast v12, La/fet;

    .line 3
    .line 4
    move-object/from16 v0, p2

    .line 5
    .line 6
    check-cast v0, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget v0, p0, La/vq40;->m:I

    .line 12
    .line 13
    or-int/lit8 v0, v0, 0x1

    .line 14
    .line 15
    invoke-static {v0}, La/x8x;->L(I)I

    .line 16
    .line 17
    .line 18
    move-result v13

    .line 19
    iget-object v0, p0, La/vq40;->a:La/mm40;

    .line 20
    .line 21
    iget v1, p0, La/vq40;->b:I

    .line 22
    .line 23
    iget v2, p0, La/vq40;->c:I

    .line 24
    .line 25
    iget-object v3, p0, La/vq40;->d:Ljava/util/Locale;

    .line 26
    .line 27
    iget-object v4, p0, La/vq40;->e:La/yq40;

    .line 28
    .line 29
    iget-boolean v5, p0, La/vq40;->f:Z

    .line 30
    .line 31
    iget-boolean v6, p0, La/vq40;->g:Z

    .line 32
    .line 33
    iget-object v7, p0, La/vq40;->h:La/gy40;

    .line 34
    .line 35
    iget-object v8, p0, La/vq40;->i:La/br8;

    .line 36
    .line 37
    iget-object v9, p0, La/vq40;->j:Lkotlin/jvm/functions/Function0;

    .line 38
    .line 39
    iget-object v10, p0, La/vq40;->k:Lkotlin/jvm/functions/Function0;

    .line 40
    .line 41
    iget-object v11, p0, La/vq40;->l:Lkotlin/jvm/functions/Function0;

    .line 42
    .line 43
    invoke-static/range {v0 .. v13}, La/g1x;->f(La/mm40;IILjava/util/Locale;La/yq40;ZZLa/gy40;La/br8;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0
.end method
