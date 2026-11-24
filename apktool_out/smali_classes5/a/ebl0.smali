.class public final synthetic La/ebl0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gbl0;

.field public final synthetic c:La/ucs;

.field public final synthetic d:Landroid/widget/ImageView;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(La/gbl0;La/ucs;Landroid/widget/ImageView;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/ebl0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ebl0;->b:La/gbl0;

    iput-object p2, p0, La/ebl0;->c:La/ucs;

    iput-object p3, p0, La/ebl0;->d:Landroid/widget/ImageView;

    iput p4, p0, La/ebl0;->e:I

    return-void
.end method

.method public synthetic constructor <init>(Landroid/widget/ImageView;La/gbl0;La/ucs;I)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/ebl0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ebl0;->d:Landroid/widget/ImageView;

    iput-object p2, p0, La/ebl0;->b:La/gbl0;

    iput-object p3, p0, La/ebl0;->c:La/ucs;

    iput p4, p0, La/ebl0;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/ebl0;->a:B

    .line 2
    .line 3
    iget v1, p0, La/ebl0;->e:I

    .line 4
    .line 5
    iget-object v2, p0, La/ebl0;->d:Landroid/widget/ImageView;

    .line 6
    .line 7
    iget-object v3, p0, La/ebl0;->c:La/ucs;

    .line 8
    .line 9
    iget-object p0, p0, La/ebl0;->b:La/gbl0;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Throwable;

    .line 15
    .line 16
    sget-object p1, La/gbl0;->c2:La/lme0;

    .line 17
    .line 18
    add-int/lit8 v1, v1, 0x1

    .line 19
    .line 20
    invoke-virtual {p0, v3, v2, v1}, La/gbl0;->K0(La/ucs;Landroid/widget/ImageView;I)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    sget-object v0, La/gbl0;->c2:La/lme0;

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    invoke-virtual {p0, v3, v2, v1}, La/gbl0;->K0(La/ucs;Landroid/widget/ImageView;I)V

    .line 39
    .line 40
    .line 41
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
