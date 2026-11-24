.class public final synthetic La/bam;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/pu90;

.field public final synthetic b:I

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:I

.field public final synthetic f:[[La/pu90;

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(La/pu90;IIII[[La/pu90;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/bam;->a:La/pu90;

    iput p2, p0, La/bam;->b:I

    iput p3, p0, La/bam;->c:I

    iput p4, p0, La/bam;->d:I

    iput p5, p0, La/bam;->e:I

    iput-object p6, p0, La/bam;->f:[[La/pu90;

    iput p7, p0, La/bam;->g:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, La/ou90;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/bam;->a:La/pu90;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {p1, v0, v1, v1, v2}, La/ou90;->m(La/pu90;IIF)V

    .line 11
    .line 12
    .line 13
    move v0, v1

    .line 14
    :goto_0
    iget v3, p0, La/bam;->b:I

    .line 15
    .line 16
    if-ge v0, v3, :cond_0

    .line 17
    .line 18
    iget v3, p0, La/bam;->c:I

    .line 19
    .line 20
    iget v4, p0, La/bam;->d:I

    .line 21
    .line 22
    add-int/2addr v3, v4

    .line 23
    iget v5, p0, La/bam;->e:I

    .line 24
    .line 25
    add-int/2addr v5, v4

    .line 26
    mul-int/2addr v5, v0

    .line 27
    add-int/2addr v5, v3

    .line 28
    iget-object v3, p0, La/bam;->f:[[La/pu90;

    .line 29
    .line 30
    aget-object v4, v3, v0

    .line 31
    .line 32
    aget-object v4, v4, v1

    .line 33
    .line 34
    invoke-virtual {p1, v4, v1, v5, v2}, La/ou90;->m(La/pu90;IIF)V

    .line 35
    .line 36
    .line 37
    aget-object v3, v3, v0

    .line 38
    .line 39
    const/4 v4, 0x1

    .line 40
    aget-object v3, v3, v4

    .line 41
    .line 42
    iget v4, p0, La/bam;->g:I

    .line 43
    .line 44
    invoke-virtual {p1, v3, v4, v5, v2}, La/ou90;->m(La/pu90;IIF)V

    .line 45
    .line 46
    .line 47
    add-int/lit8 v0, v0, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object p0
.end method
