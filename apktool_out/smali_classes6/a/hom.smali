.class public final synthetic La/hom;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:Z

.field public final synthetic c:La/wom;

.field public final synthetic d:La/u12;

.field public final synthetic e:Z

.field public final synthetic f:La/vj50;

.field public final synthetic g:Lkotlin/jvm/functions/Function0;

.field public final synthetic h:La/ydr;

.field public final synthetic i:La/xdr;

.field public final synthetic j:I

.field public final synthetic k:S


# direct methods
.method public synthetic constructor <init>(La/mm40;ZLa/wom;La/u12;ZLa/vj50;Lkotlin/jvm/functions/Function0;La/ydr;La/xdr;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/hom;->a:La/mm40;

    iput-boolean p2, p0, La/hom;->b:Z

    iput-object p3, p0, La/hom;->c:La/wom;

    iput-object p4, p0, La/hom;->d:La/u12;

    iput-boolean p5, p0, La/hom;->e:Z

    iput-object p6, p0, La/hom;->f:La/vj50;

    iput-object p7, p0, La/hom;->g:Lkotlin/jvm/functions/Function0;

    iput-object p8, p0, La/hom;->h:La/ydr;

    iput-object p9, p0, La/hom;->i:La/xdr;

    iput p10, p0, La/hom;->j:I

    iput-short p11, p0, La/hom;->k:S

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
    iget p1, p0, La/hom;->j:I

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
    iget-object v0, p0, La/hom;->a:La/mm40;

    .line 18
    .line 19
    iget-boolean v1, p0, La/hom;->b:Z

    .line 20
    .line 21
    iget-object v2, p0, La/hom;->c:La/wom;

    .line 22
    .line 23
    iget-object v3, p0, La/hom;->d:La/u12;

    .line 24
    .line 25
    iget-boolean v4, p0, La/hom;->e:Z

    .line 26
    .line 27
    iget-object v5, p0, La/hom;->f:La/vj50;

    .line 28
    .line 29
    iget-object v6, p0, La/hom;->g:Lkotlin/jvm/functions/Function0;

    .line 30
    .line 31
    iget-object v7, p0, La/hom;->h:La/ydr;

    .line 32
    .line 33
    iget-object v8, p0, La/hom;->i:La/xdr;

    .line 34
    .line 35
    iget-short v11, p0, La/hom;->k:S

    .line 36
    .line 37
    invoke-static/range {v0 .. v11}, La/mom;->c(La/mm40;ZLa/wom;La/u12;ZLa/vj50;Lkotlin/jvm/functions/Function0;La/ydr;La/xdr;La/fet;II)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0
.end method
