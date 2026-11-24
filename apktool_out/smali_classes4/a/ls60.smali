.class public final La/ls60;
.super La/i26;
.source "SourceFile"


# instance fields
.field public final g:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    sget-object v0, La/iun;->a:La/iun;

    .line 2
    .line 3
    new-instance v1, La/wk60;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {v1, v2}, La/wk60;-><init>(B)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, v0, v1}, La/i26;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, La/ls60;->g:Lkotlin/jvm/functions/Function1;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final A(I)I
    .locals 0

    .line 1
    sget p0, La/v70;->x:I

    .line 2
    .line 3
    const p0, 0x7f0d0684

    .line 4
    .line 5
    .line 6
    return p0
.end method

.method public final z(Landroid/view/View;)La/v46;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/v70;

    .line 5
    .line 6
    iget-object p0, p0, La/ls60;->g:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    invoke-direct {v0, p1, p0}, La/v70;-><init>(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
