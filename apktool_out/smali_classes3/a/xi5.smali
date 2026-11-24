.class public final synthetic La/xi5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:La/p2k0;

.field public final synthetic c:I

.field public final synthetic d:La/oyq0;

.field public final synthetic e:La/c3d;

.field public final synthetic f:Lkotlin/jvm/functions/Function0;

.field public final synthetic g:Lkotlin/jvm/functions/Function0;

.field public final synthetic h:Lkotlin/jvm/functions/Function1;

.field public final synthetic i:Lkotlin/jvm/functions/Function0;

.field public final synthetic j:Lkotlin/jvm/functions/Function0;

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(La/mm40;La/p2k0;ILa/oyq0;La/c3d;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/xi5;->a:La/mm40;

    iput-object p2, p0, La/xi5;->b:La/p2k0;

    iput p3, p0, La/xi5;->c:I

    iput-object p4, p0, La/xi5;->d:La/oyq0;

    iput-object p5, p0, La/xi5;->e:La/c3d;

    iput-object p6, p0, La/xi5;->f:Lkotlin/jvm/functions/Function0;

    iput-object p7, p0, La/xi5;->g:Lkotlin/jvm/functions/Function0;

    iput-object p8, p0, La/xi5;->h:Lkotlin/jvm/functions/Function1;

    iput-object p9, p0, La/xi5;->i:Lkotlin/jvm/functions/Function0;

    iput-object p10, p0, La/xi5;->j:Lkotlin/jvm/functions/Function0;

    iput p11, p0, La/xi5;->k:I

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
    iget p1, p0, La/xi5;->k:I

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
    iget-object v0, p0, La/xi5;->a:La/mm40;

    .line 18
    .line 19
    iget-object v1, p0, La/xi5;->b:La/p2k0;

    .line 20
    .line 21
    iget v2, p0, La/xi5;->c:I

    .line 22
    .line 23
    iget-object v3, p0, La/xi5;->d:La/oyq0;

    .line 24
    .line 25
    iget-object v4, p0, La/xi5;->e:La/c3d;

    .line 26
    .line 27
    iget-object v5, p0, La/xi5;->f:Lkotlin/jvm/functions/Function0;

    .line 28
    .line 29
    iget-object v6, p0, La/xi5;->g:Lkotlin/jvm/functions/Function0;

    .line 30
    .line 31
    iget-object v7, p0, La/xi5;->h:Lkotlin/jvm/functions/Function1;

    .line 32
    .line 33
    iget-object v8, p0, La/xi5;->i:Lkotlin/jvm/functions/Function0;

    .line 34
    .line 35
    iget-object v9, p0, La/xi5;->j:Lkotlin/jvm/functions/Function0;

    .line 36
    .line 37
    invoke-static/range {v0 .. v11}, La/fre0;->f(La/mm40;La/p2k0;ILa/oyq0;La/c3d;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0
.end method
