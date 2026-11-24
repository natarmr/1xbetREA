.class public final synthetic La/es5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/fs5;


# direct methods
.method public synthetic constructor <init>(La/fs5;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/es5;->a:B

    iput-object p1, p0, La/es5;->b:La/fs5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/es5;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/es5;->b:La/fs5;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/r0x;

    .line 9
    .line 10
    iget-object p0, p0, La/fs5;->i:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 11
    .line 12
    invoke-direct {v0, p0}, La/r0x;-><init>(Landroid/widget/ImageView;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    new-instance v0, La/r0x;

    .line 17
    .line 18
    iget-object p0, p0, La/fs5;->h:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 19
    .line 20
    invoke-direct {v0, p0}, La/r0x;-><init>(Landroid/widget/ImageView;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
