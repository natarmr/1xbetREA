.class public final synthetic La/z1g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/pu90;

.field public final synthetic b:La/pu90;

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:La/pu90;

.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:La/pu90;

.field public final synthetic i:I

.field public final synthetic j:I

.field public final synthetic k:La/pu90;

.field public final synthetic l:I

.field public final synthetic m:I

.field public final synthetic n:La/pu90;

.field public final synthetic o:I

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(La/pu90;La/pu90;IILa/pu90;IILa/pu90;IILa/pu90;IILa/pu90;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/z1g;->a:La/pu90;

    iput-object p2, p0, La/z1g;->b:La/pu90;

    iput p3, p0, La/z1g;->c:I

    iput p4, p0, La/z1g;->d:I

    iput-object p5, p0, La/z1g;->e:La/pu90;

    iput p6, p0, La/z1g;->f:I

    iput p7, p0, La/z1g;->g:I

    iput-object p8, p0, La/z1g;->h:La/pu90;

    iput p9, p0, La/z1g;->i:I

    iput p10, p0, La/z1g;->j:I

    iput-object p11, p0, La/z1g;->k:La/pu90;

    iput p12, p0, La/z1g;->l:I

    iput p13, p0, La/z1g;->m:I

    iput-object p14, p0, La/z1g;->n:La/pu90;

    iput p15, p0, La/z1g;->o:I

    move/from16 p1, p16

    iput p1, p0, La/z1g;->p:I

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
    const/4 v0, 0x0

    .line 7
    iget-object v1, p0, La/z1g;->a:La/pu90;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {p1, v1, v2, v2, v0}, La/ou90;->m(La/pu90;IIF)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v1, p0, La/z1g;->b:La/pu90;

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iget v2, p0, La/z1g;->c:I

    .line 20
    .line 21
    iget v3, p0, La/z1g;->d:I

    .line 22
    .line 23
    invoke-virtual {p1, v1, v2, v3, v0}, La/ou90;->m(La/pu90;IIF)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget-object v1, p0, La/z1g;->e:La/pu90;

    .line 27
    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    iget v2, p0, La/z1g;->f:I

    .line 31
    .line 32
    iget v3, p0, La/z1g;->g:I

    .line 33
    .line 34
    invoke-virtual {p1, v1, v2, v3, v0}, La/ou90;->m(La/pu90;IIF)V

    .line 35
    .line 36
    .line 37
    :cond_2
    iget-object v1, p0, La/z1g;->h:La/pu90;

    .line 38
    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    iget v2, p0, La/z1g;->i:I

    .line 42
    .line 43
    iget v3, p0, La/z1g;->j:I

    .line 44
    .line 45
    invoke-virtual {p1, v1, v2, v3, v0}, La/ou90;->m(La/pu90;IIF)V

    .line 46
    .line 47
    .line 48
    :cond_3
    iget-object v1, p0, La/z1g;->k:La/pu90;

    .line 49
    .line 50
    if-eqz v1, :cond_4

    .line 51
    .line 52
    iget v2, p0, La/z1g;->l:I

    .line 53
    .line 54
    iget v3, p0, La/z1g;->m:I

    .line 55
    .line 56
    invoke-virtual {p1, v1, v2, v3, v0}, La/ou90;->m(La/pu90;IIF)V

    .line 57
    .line 58
    .line 59
    :cond_4
    iget-object v1, p0, La/z1g;->n:La/pu90;

    .line 60
    .line 61
    if-eqz v1, :cond_5

    .line 62
    .line 63
    iget v2, p0, La/z1g;->o:I

    .line 64
    .line 65
    iget p0, p0, La/z1g;->p:I

    .line 66
    .line 67
    invoke-virtual {p1, v1, v2, p0, v0}, La/ou90;->m(La/pu90;IIF)V

    .line 68
    .line 69
    .line 70
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p0
.end method
