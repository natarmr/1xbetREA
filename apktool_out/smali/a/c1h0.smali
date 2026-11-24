.class public final synthetic La/c1h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/pu90;

.field public final synthetic b:La/pu90;

.field public final synthetic c:La/pu90;

.field public final synthetic d:I

.field public final synthetic e:La/vhv0;

.field public final synthetic f:La/c5n0;

.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:La/pu90;

.field public final synthetic j:La/eld0;

.field public final synthetic k:La/pu90;

.field public final synthetic l:Ljava/lang/Integer;


# direct methods
.method public synthetic constructor <init>(La/pu90;La/pu90;La/pu90;ILa/vhv0;La/c5n0;IILa/pu90;La/eld0;La/pu90;Ljava/lang/Integer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/c1h0;->a:La/pu90;

    iput-object p2, p0, La/c1h0;->b:La/pu90;

    iput-object p3, p0, La/c1h0;->c:La/pu90;

    iput p4, p0, La/c1h0;->d:I

    iput-object p5, p0, La/c1h0;->e:La/vhv0;

    iput-object p6, p0, La/c1h0;->f:La/c5n0;

    iput p7, p0, La/c1h0;->g:I

    iput p8, p0, La/c1h0;->h:I

    iput-object p9, p0, La/c1h0;->i:La/pu90;

    iput-object p10, p0, La/c1h0;->j:La/eld0;

    iput-object p11, p0, La/c1h0;->k:La/pu90;

    iput-object p12, p0, La/c1h0;->l:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, La/ou90;

    .line 2
    .line 3
    iget-object v0, p0, La/c1h0;->a:La/pu90;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {p1, v0, v1, v1}, La/ou90;->h(La/ou90;La/pu90;II)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, La/c1h0;->b:La/pu90;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {p1, v0, v1, v1, v2}, La/ou90;->g(La/pu90;IIF)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, La/c1h0;->c:La/pu90;

    .line 16
    .line 17
    iget v3, v0, La/pu90;->a:I

    .line 18
    .line 19
    iget v4, p0, La/c1h0;->d:I

    .line 20
    .line 21
    sub-int/2addr v4, v3

    .line 22
    iget-object v3, p0, La/c1h0;->f:La/c5n0;

    .line 23
    .line 24
    invoke-interface {v3}, La/cnx;->getLayoutDirection()La/k6z;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    iget-object v6, p0, La/c1h0;->e:La/vhv0;

    .line 29
    .line 30
    invoke-interface {v6, v3, v5}, La/vhv0;->a(La/w6k;La/k6z;)I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    add-int/2addr v5, v4

    .line 35
    invoke-interface {v3}, La/cnx;->getLayoutDirection()La/k6z;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-interface {v6, v3, v4}, La/vhv0;->c(La/w6k;La/k6z;)I

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    sub-int/2addr v5, v3

    .line 44
    div-int/lit8 v5, v5, 0x2

    .line 45
    .line 46
    iget v3, p0, La/c1h0;->g:I

    .line 47
    .line 48
    iget v4, p0, La/c1h0;->h:I

    .line 49
    .line 50
    sub-int v4, v3, v4

    .line 51
    .line 52
    invoke-virtual {p1, v0, v5, v4, v2}, La/ou90;->g(La/pu90;IIF)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, La/c1h0;->i:La/pu90;

    .line 56
    .line 57
    iget v4, v0, La/pu90;->b:I

    .line 58
    .line 59
    sub-int v4, v3, v4

    .line 60
    .line 61
    invoke-virtual {p1, v0, v1, v4, v2}, La/ou90;->g(La/pu90;IIF)V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, La/c1h0;->j:La/eld0;

    .line 65
    .line 66
    if-eqz v0, :cond_0

    .line 67
    .line 68
    iget v0, v0, La/eld0;->b:I

    .line 69
    .line 70
    iget-object v1, p0, La/c1h0;->l:Ljava/lang/Integer;

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    sub-int/2addr v3, v1

    .line 80
    iget-object p0, p0, La/c1h0;->k:La/pu90;

    .line 81
    .line 82
    invoke-virtual {p1, p0, v0, v3, v2}, La/ou90;->g(La/pu90;IIF)V

    .line 83
    .line 84
    .line 85
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object p0
.end method
