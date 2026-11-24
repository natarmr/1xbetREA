.class public final synthetic La/wds0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/pu90;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:La/pu90;

.field public final synthetic f:I

.field public final synthetic g:La/pu90;

.field public final synthetic h:I

.field public final synthetic i:La/pu90;

.field public final synthetic j:I

.field public final synthetic k:La/pu90;

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(La/pu90;IIILa/pu90;ILa/pu90;ILa/pu90;ILa/pu90;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/wds0;->a:La/pu90;

    iput p2, p0, La/wds0;->b:I

    iput p3, p0, La/wds0;->c:I

    iput p4, p0, La/wds0;->d:I

    iput-object p5, p0, La/wds0;->e:La/pu90;

    iput p6, p0, La/wds0;->f:I

    iput-object p7, p0, La/wds0;->g:La/pu90;

    iput p8, p0, La/wds0;->h:I

    iput-object p9, p0, La/wds0;->i:La/pu90;

    iput p10, p0, La/wds0;->j:I

    iput-object p11, p0, La/wds0;->k:La/pu90;

    iput p12, p0, La/wds0;->l:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, La/ou90;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/wds0;->a:La/pu90;

    .line 7
    .line 8
    iget v1, v0, La/pu90;->b:I

    .line 9
    .line 10
    iget v2, p0, La/wds0;->d:I

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    iget v4, p0, La/wds0;->c:I

    .line 14
    .line 15
    invoke-static {v2, v1, v3, v4}, La/hne;->d(IIII)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget v5, p0, La/wds0;->b:I

    .line 20
    .line 21
    const/4 v6, 0x0

    .line 22
    invoke-virtual {p1, v0, v5, v1, v6}, La/ou90;->m(La/pu90;IIF)V

    .line 23
    .line 24
    .line 25
    iget v0, v0, La/pu90;->a:I

    .line 26
    .line 27
    add-int/2addr v0, v5

    .line 28
    iget v1, p0, La/wds0;->f:I

    .line 29
    .line 30
    add-int/2addr v0, v1

    .line 31
    iget-object v1, p0, La/wds0;->e:La/pu90;

    .line 32
    .line 33
    iget v7, v1, La/pu90;->b:I

    .line 34
    .line 35
    invoke-static {v2, v7, v3, v4}, La/hne;->d(IIII)I

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    invoke-virtual {p1, v1, v0, v7, v6}, La/ou90;->m(La/pu90;IIF)V

    .line 40
    .line 41
    .line 42
    iget v0, p0, La/wds0;->h:I

    .line 43
    .line 44
    add-int/2addr v0, v5

    .line 45
    iget-object v1, p0, La/wds0;->g:La/pu90;

    .line 46
    .line 47
    iget v7, v1, La/pu90;->b:I

    .line 48
    .line 49
    invoke-static {v2, v7, v3, v4}, La/hne;->d(IIII)I

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    invoke-virtual {p1, v1, v0, v7, v6}, La/ou90;->m(La/pu90;IIF)V

    .line 54
    .line 55
    .line 56
    iget v1, p0, La/wds0;->j:I

    .line 57
    .line 58
    sub-int/2addr v1, v5

    .line 59
    iget-object v5, p0, La/wds0;->i:La/pu90;

    .line 60
    .line 61
    iget v7, v5, La/pu90;->a:I

    .line 62
    .line 63
    sub-int/2addr v1, v7

    .line 64
    iget v7, v5, La/pu90;->b:I

    .line 65
    .line 66
    invoke-static {v2, v7, v3, v4}, La/hne;->d(IIII)I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-virtual {p1, v5, v1, v2, v6}, La/ou90;->m(La/pu90;IIF)V

    .line 71
    .line 72
    .line 73
    iget-object v1, p0, La/wds0;->k:La/pu90;

    .line 74
    .line 75
    if-eqz v1, :cond_0

    .line 76
    .line 77
    iget v2, v1, La/pu90;->b:I

    .line 78
    .line 79
    iget p0, p0, La/wds0;->l:I

    .line 80
    .line 81
    sub-int/2addr p0, v2

    .line 82
    invoke-virtual {p1, v1, v0, p0, v6}, La/ou90;->m(La/pu90;IIF)V

    .line 83
    .line 84
    .line 85
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object p0
.end method
