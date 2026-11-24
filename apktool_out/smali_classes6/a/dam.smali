.class public final synthetic La/dam;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:[La/pu90;

.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:[[La/pu90;


# direct methods
.method public synthetic constructor <init>(III[La/pu90;IIII[[La/pu90;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/dam;->a:I

    iput p2, p0, La/dam;->b:I

    iput p3, p0, La/dam;->c:I

    iput-object p4, p0, La/dam;->d:[La/pu90;

    iput p5, p0, La/dam;->e:I

    iput p6, p0, La/dam;->f:I

    iput p7, p0, La/dam;->g:I

    iput p8, p0, La/dam;->h:I

    iput-object p9, p0, La/dam;->i:[[La/pu90;

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
    const/4 v0, 0x0

    .line 7
    move v1, v0

    .line 8
    :goto_0
    iget v2, p0, La/dam;->a:I

    .line 9
    .line 10
    if-ge v1, v2, :cond_1

    .line 11
    .line 12
    iget v2, p0, La/dam;->b:I

    .line 13
    .line 14
    iget v3, p0, La/dam;->c:I

    .line 15
    .line 16
    add-int/2addr v2, v3

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v3, p0, La/dam;->d:[La/pu90;

    .line 19
    .line 20
    aget-object v3, v3, v1

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-virtual {p1, v3, v2, v0, v4}, La/ou90;->m(La/pu90;IIF)V

    .line 24
    .line 25
    .line 26
    move v3, v0

    .line 27
    :goto_1
    iget v5, p0, La/dam;->e:I

    .line 28
    .line 29
    if-ge v3, v5, :cond_0

    .line 30
    .line 31
    iget v5, p0, La/dam;->f:I

    .line 32
    .line 33
    iget v6, p0, La/dam;->g:I

    .line 34
    .line 35
    add-int/2addr v5, v6

    .line 36
    iget v7, p0, La/dam;->h:I

    .line 37
    .line 38
    add-int/2addr v7, v6

    .line 39
    mul-int/2addr v7, v3

    .line 40
    add-int/2addr v7, v5

    .line 41
    iget-object v5, p0, La/dam;->i:[[La/pu90;

    .line 42
    .line 43
    aget-object v5, v5, v3

    .line 44
    .line 45
    aget-object v5, v5, v1

    .line 46
    .line 47
    invoke-virtual {p1, v5, v2, v7, v4}, La/ou90;->m(La/pu90;IIF)V

    .line 48
    .line 49
    .line 50
    add-int/lit8 v3, v3, 0x1

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object p0
.end method
